package dev.bruandreo.bytebank.teste

fun main() {
    println("Bem vindo ao ByteBank")

    soma(1, 5, ::println)

    soma(1, 4, resultado = { println(it) })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}