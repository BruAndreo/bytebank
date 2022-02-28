class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double get() = salario * 0.3

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}