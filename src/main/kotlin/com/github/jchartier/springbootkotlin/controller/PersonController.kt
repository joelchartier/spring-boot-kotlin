package com.github.jchartier.springbootkotlin.controller

import com.github.jchartier.springbootkotlin.repository.PersonRepository
import org.springframework.data.repository.query.Param
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class PersonController(val repository: PersonRepository) {

    @GetMapping("/person/{id}")
    fun get(@PathVariable("id") id: Long) = repository.getOne(id)

    @GetMapping("/person")
    fun findByLastName(@Param("email") email: String) = repository.getByEmail(email)
}