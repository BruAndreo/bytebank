fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente("Bruno", 123)
    val contaPoupanca = ContaPoupanca("Geovana", 124)

    contaCorrente.depositar(1000.0)
    contaPoupanca.depositar(1000.0)

    println("Saldo conta corrente: R$ ${contaCorrente.saldo}")
    println("Saldo conta poupança: R$ ${contaPoupanca.saldo}")

    contaCorrente.sacar(100.0)
    contaPoupanca.sacar(100.0)

    println("Saldo conta corrente após saque: R$ ${contaCorrente.saldo}")
    println("Saldo conta poupança após saque: R$ ${contaPoupanca.saldo}")

    contaCorrente.transferencia(contaPoupanca, 100.0)

    println("Saldo conta corrente após tranferir: R$ ${contaCorrente.saldo}")
    println("Saldo conta poupança após receber transferencia: R$ ${contaPoupanca.saldo}")
}