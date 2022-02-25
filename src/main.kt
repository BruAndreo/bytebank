fun main() {
    println("Bem vindo ao ByteBank")

    val contaBruno = Conta("Bruno", 12345)
    contaBruno.depositar(100.0)

    println("${contaBruno.titular} | Conta: ${contaBruno.numero}")
    println("Seu saldo é de: R$ ${contaBruno.saldo}")

    contaBruno.sacar(50.2)
    println("Seu saldo é de: R$ ${contaBruno.saldo}")

    val contaGeovana = Conta("Geovana", 12346)

    contaBruno.transferencia(contaGeovana, 40.0)

    println("Saldo da conta da Geovana é de R$ ${contaGeovana.saldo}")
    println("Saldo da conta do Bruno é de R$ ${contaBruno.saldo}")
}

class Conta(val titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) {
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