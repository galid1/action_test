package com.galid1.action_test

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(
    private val helloService: HelloService
) {
    @GetMapping("/")
    fun hello() {
        val helloEntity = HelloEntity("JJY")
        helloService.hello(helloEntity)
    }
}