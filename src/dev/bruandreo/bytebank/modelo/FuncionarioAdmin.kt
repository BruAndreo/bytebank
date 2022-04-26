package dev.bruandreo.bytebank.modelo

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    fun autenticar(senha: Int): Boolean = this.senha == senha

}
