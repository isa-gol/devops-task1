package com.devops.task1.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class HelloController {

    @GetMapping("hello")
    fun hello(): String {
        return "Hello ${Random().nextInt()}"
    }
}