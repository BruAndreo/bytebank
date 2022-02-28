fun testaComportamentosConta() {
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