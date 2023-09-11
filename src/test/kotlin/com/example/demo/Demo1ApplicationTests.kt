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
        val num = 1
        val a = Mono.just(num)
        var b = 0
        a.subscribe { b = it }
        assert(b == num)
    }

}
