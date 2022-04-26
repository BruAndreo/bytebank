package modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(nome, cpf, salario, senha), AutenticaImpl {

    override val bonificacao: Double
        get() = salario

}