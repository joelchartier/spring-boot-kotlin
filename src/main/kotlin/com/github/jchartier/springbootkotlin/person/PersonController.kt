package com.github.jchartier.springbootkotlin.person

import org.springframework.data.repository.query.Param
import org.springframework.web.bind.annotation.*

@RestController
class PersonController(val repository: PersonRepository) {

    @GetMapping("/person/all")
    fun findAll() : List<Person> = repository.findAll()

    @GetMapping("/person/{id}")
    fun get(@PathVariable("id") id: Long) : Person =
            repository.getOne(id)

    @PostMapping("/person")
    fun create(@RequestBody person: PersonCreationRequest) : Person =
            repository.saveAndFlush(Person(person.email, person.name))

    @GetMapping("/person")
    fun getByEmail(@Param("email") email: String) : Person =
            repository.findByEmail(email)
}