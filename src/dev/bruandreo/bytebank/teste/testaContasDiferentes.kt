import dev.bruandreo.bytebank.modelo.Cliente
import dev.bruandreo.bytebank.modelo.ContaCorrente
import dev.bruandreo.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(Cliente("Bruno", "111.111.111-11", 123), 123)
    val contaPoupanca = ContaPoupanca(Cliente("Geovana", "222.222.222-22", 456), 124)

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