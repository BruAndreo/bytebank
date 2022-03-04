open class Conta(val titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        saldo += valor
    }

    open fun sacar(valor: Double) {
        if (!saldoEhSuficiente(valor)) {
            println("Saldo insuficiente")
            return
        }

        saldo -= valor
        println("Saque efetuado com sucesso")
    }

    fun transferencia(contaDestino: Conta, valor: Double) {
        if (!saldoEhSuficiente(valor)) {
            println("Saldo insuficiente")
            return
        }

        saldo -= valor
        contaDestino.depositar(valor)
        println("Transferencia realizada para Conta ${contaDestino.numero}")
    }

    private fun saldoEhSuficiente(valor: Double): Boolean {
        return saldo >= valor
    }
}