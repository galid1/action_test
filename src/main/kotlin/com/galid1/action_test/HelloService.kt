package com.galid1.action_test

import org.springframework.stereotype.Service

@Service
class HelloService(

) {
    fun hello(helloEntity: HelloEntity) {
        helloEntity.hello()
    }
}