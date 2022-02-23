fun main() {
    println("Bem vindo ao ByteBank")

    val contaBruno = Conta()
    contaBruno.titular = "Bruno"
    contaBruno.numero = 12345
    contaBruno.depositar(100.0)

    println("${contaBruno.titular} | Conta: ${contaBruno.numero}")
    println("Seu saldo é de: R$ ${contaBruno.saldo}")

    contaBruno.sacar(150.0)

    contaBruno.sacar(50.2)
    println("Seu saldo é de: R$ ${contaBruno.saldo}")
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun depositar(valor: Double) {
        saldo += valor
    }

    fun sacar(valor: Double) {
        if (saldoEstaNegativo()) {
            println("Saldo insuficiente")
            return
        }

        saldo -= valor
        println("Saque efetuado com sucesso")
    }

    private fun saldoEstaNegativo(): Boolean {
        return saldo <= 0.0;
    }
}