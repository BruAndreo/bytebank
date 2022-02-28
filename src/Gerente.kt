class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double
        get() {
            return salario * 0.2
        }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}