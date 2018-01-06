package com.github.jchartier.springbootkotlin.person

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
@Table(name = "person")
data class Person(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long?,
        val email: String?,
        val name: String?) {

    constructor(): this(null, null, null)
    constructor(email: String, name: String): this(null, email, name)
}