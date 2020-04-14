package com.kratostaine.userservice.model

data class User(val name: String)

data class NewUser(val name: Name)

data class Name(val firstName: String, val lastName: String)
