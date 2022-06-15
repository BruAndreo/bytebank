package dev.bruandreo.bytebank

import dev.bruandreo.bytebank.modelo.Cliente
import dev.bruandreo.bytebank.modelo.ContaPoupanca
import dev.bruandreo.bytebank.modelo.Endereco

fun main() {
    println("Bem vindo ao ByteBank")


}

fun testaRun() {
    val qtdMonths = 12
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / qtdMonths
    println("Taxa mensal da conta poupança é de $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome="Bruno", cpf="111", senha=213), 1111)

    contaPoupanca.run {
        depositar(2000.0)
        saldo * taxaMensal
    }
        .let {rendimentoMensal -> println("Seu rendimento mensal é de $rendimentoMensal")}

    val rendimentoAnual = run {
        var saldo = contaPoupanca.saldo
        repeat(qtdMonths) {
            saldo += saldo * taxaMensal
        }
    }
    println("Seu rendimento anual é de $rendimentoAnual")
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Vergueiro"
        numero = "139"
        cidade = "São Paulo"
        complemento = "Bl1, AP54"
        completo()
    }.let {enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}
