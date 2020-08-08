package org.example

import java.io.PrintStream

interface Greeter {
    fun setPrintStream(printStream: PrintStream)
    fun greet()
}