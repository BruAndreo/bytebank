package dev.bruandreo.bytebank.modelo

abstract class Conta(val titular: Cliente, val numero: Int) {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }

    fun depositar(valor: Double) {
        saldo += valor
    }

    abstract fun sacar(valor: Double)

    fun transferencia(contaDestino: Conta, valor: Double) {
        if (!saldoEhSuficiente(valor)) {
            println("Saldo insuficiente")
            return
        }

        saldo -= valor
        contaDestino.depositar(valor)
        println("Transferencia realizada para dev.bruandreo.bytebank.modelo.Conta ${contaDestino.numero}")
    }

    private fun saldoEhSuficiente(valor: Double): Boolean {
        return saldo >= valor
    }

    override fun toString(): String {
        return "Conta $numero - Titular ${titular.nome}"
    }
}