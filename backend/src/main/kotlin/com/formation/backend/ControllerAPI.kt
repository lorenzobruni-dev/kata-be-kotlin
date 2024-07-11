package com.formation.backend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ControllerAPI {
    @GetMapping("/hello")
    fun sayHello(): String{
        return "Hello, World!"
    }
}