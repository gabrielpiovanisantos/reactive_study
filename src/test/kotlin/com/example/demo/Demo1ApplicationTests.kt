package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import reactor.core.publisher.Mono

@SpringBootTest
class Demo1ApplicationTests {

    @Test
    fun contextLoads() {
    }

    @Test
    fun `comparing a variable that is inside a mono`() {
        val a = Mono.just(1)
        var b = 0
        a.subscribe { it ->
            b = it
        }
        println("comp = $b")
    }

}
