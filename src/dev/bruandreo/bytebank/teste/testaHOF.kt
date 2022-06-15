package dev.bruandreo.bytebank.teste

fun main() {
    println("Bem vindo ao ByteBank")

    soma(1, 4, resultado = { println(it) })

    soma(1, 5, ::println)
    somaReceiver(1, 5, ::println)
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    resultado(a + b)
}