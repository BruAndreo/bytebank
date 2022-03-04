class ContaCorrente(titular: String, numero: Int) : Conta(titular, numero) {

    override fun sacar(valor: Double) {
        val valorComTaxa = valor + 0.10
        super.sacar(valorComTaxa)
    }
}