package com.kratostaine.userservice.controller

import com.kratostaine.userservice.constant.Versions
import com.kratostaine.userservice.model.Name
import com.kratostaine.userservice.model.NewUser
import com.kratostaine.userservice.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping("/users", headers = ["Accept=${Versions.VERSION_1_HEADER}"])
    fun getUser(): User {
        return User("Christiano Ronaldo")
    }

    @GetMapping("/users", headers = ["Accept=${Versions.VERSION_2_HEADER}"])
    fun getNewUser(): NewUser {
        return NewUser(Name("Christiano", "Ronaldo"))
    }
}