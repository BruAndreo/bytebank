class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome, cpf, salario) {

    override fun bonificacao(): Double {
        return super.bonificacao() + salario
    }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}