package org.example

import java.io.PrintStream

class HelloWorldGreeter: Greeter {
    private lateinit var _printStream: PrintStream
    override fun setPrintStream(printStream: PrintStream) {
        _printStream = printStream
    }

    override fun greet() {
        _printStream.print("Hello World!")
    }
}