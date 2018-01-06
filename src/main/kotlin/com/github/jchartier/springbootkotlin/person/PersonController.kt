package com.github.jchartier.springbootkotlin.person

import org.springframework.data.repository.query.Param
import org.springframework.web.bind.annotation.*

@RestController
class PersonController(val repository: PersonRepository) {

    @GetMapping("/person/{id}")
    fun get(@PathVariable("id") id: Long) : PersonEntity = repository.getOne(id)

    @GetMapping("/person")
    fun getByEmail(@Param("email") email: String) : PersonEntity = repository.findByEmail(email)
}