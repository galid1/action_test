package com.galid1.action_test

import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith


@ExtendWith(MockKExtension::class)
internal class HelloServiceTest {

    val helloService = HelloService()

    @Test
    fun `hello service test`() {
        println("TEST@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@")

        // given
        val entity = mockk<HelloEntity>(relaxed = true)

        // when
        helloService.hello(entity)

        // then
        verify {
            entity.hello()
        }
    }
}