package dev.bruandreo.bytebank.teste

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
    ).run {
        nome.uppercase()
    }.let(::println)
}
