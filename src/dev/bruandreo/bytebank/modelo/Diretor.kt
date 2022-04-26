package dev.bruandreo.bytebank.modelo

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(nome, cpf, salario, senha), AutenticaImpl {

    override val bonificacao: Double
        get() = salario + plr

}