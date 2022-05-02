import dev.bruandreo.bytebank.modelo.Cliente
import dev.bruandreo.bytebank.modelo.ContaCorrente
import dev.bruandreo.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {
    val contaBruno = ContaCorrente(Cliente("Bruno", "111.111.111-11", 123), 12345)
    contaBruno.depositar(100.0)

    println("${contaBruno.titular.nome} | dev.bruandreo.bytebank.modelo.Conta: ${contaBruno.numero}")
    println("Seu saldo é de: R$ ${contaBruno.saldo}")

    contaBruno.sacar(50.2)
    println("Seu saldo é de: R$ ${contaBruno.saldo}")

    val contaGeovana = ContaPoupanca(Cliente("Geovana", "222.222.222-22", 456), 12346)

    contaBruno.transferencia(contaGeovana, 40.0)

    println("Saldo da conta da Geovana é de R$ ${contaGeovana.saldo}")
    println("Saldo da conta do Bruno é de R$ ${contaBruno.saldo}")
}