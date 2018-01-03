package com.github.jchartier.springbootkotlin.repository

import com.github.jchartier.springbootkotlin.model.PersonEntity
import org.springframework.data.jpa.repository.JpaRepository
import javax.transaction.Transactional

@Transactional
interface PersonRepository : JpaRepository<PersonEntity, Long> {

    fun getByEmail(email: String): PersonEntity
}