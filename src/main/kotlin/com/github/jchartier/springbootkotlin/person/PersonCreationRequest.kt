package com.github.jchartier.springbootkotlin.person

data class PersonCreationRequest(val email: String = "", val name: String = "")