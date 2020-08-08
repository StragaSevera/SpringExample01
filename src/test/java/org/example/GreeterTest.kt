@file:Suppress("BlockingMethodInNonBlockingContext")

package org.example

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import java.nio.charset.StandardCharsets

class GreeterTest: DescribeSpec({
    describe("HelloWorldGreeter") {
        it("outputs correct data") {
            val greeter = HelloWorldGreeter()
            val byteStream = ByteArrayOutputStream()
            PrintStream(byteStream, true, "UTF-8").use { printStream ->
                greeter.setPrintStream(printStream)
                greeter.greet()
            }
            val data = byteStream.toString(StandardCharsets.UTF_8)
            data.shouldBe("Hello World!")
        }
    }
})