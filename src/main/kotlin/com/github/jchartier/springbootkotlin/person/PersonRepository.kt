package com.github.jchartier.springbootkotlin.person

import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional

@Transactional
interface PersonRepository : JpaRepository<Person, Long> {

    fun findByEmail(email: String): Person
}