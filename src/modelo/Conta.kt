package modelo

abstract class Conta(val titular: String, val numero: Int) {
    var saldo = 0.0
        protected set

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
        println("Transferencia realizada para modelo.Conta ${contaDestino.numero}")
    }

    private fun saldoEhSuficiente(valor: Double): Boolean {
        return saldo >= valor
    }
}