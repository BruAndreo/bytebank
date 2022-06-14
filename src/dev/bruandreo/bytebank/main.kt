package dev.bruandreo.bytebank

import dev.bruandreo.bytebank.modelo.Cliente

fun main() {
    println("Bem vindo ao ByteBank")

    val cliente = Cliente("Bruno", "11111111111", 123)
    val nomeMaiusculo = cliente.nome.uppercase()
    println(nomeMaiusculo)

    Cliente(
        nome = "Geovana",
        cpf = "22222222222",
        senha = 456
    ).let {
        it.nome.uppercase()
    }.let(::println)

    soma(1, 5, ::println)

    soma(1, 4, resultado = { println(it) })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}
