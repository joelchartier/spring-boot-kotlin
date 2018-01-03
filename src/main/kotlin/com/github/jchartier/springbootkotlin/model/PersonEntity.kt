package com.github.jchartier.springbootkotlin.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "person")
data class PersonEntity(@Id val id: Long = 0, val name: String = "", val email: String = "")