package com.example

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GreeterTest {
    private val greeter = Greeter()

    @Test
    fun `greet returns personalised greeting`() {
        assertEquals("Hello, World!", greeter.greet("World"))
    }

    @Test
    fun `greet works with any name`() {
        assertEquals("Hello, Kotlin!", greeter.greet("Kotlin"))
    }
}
