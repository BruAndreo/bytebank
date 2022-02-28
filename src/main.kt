fun main() {
    println("Bem vindo ao ByteBank")

    val Bruno = Funcionario("Bruno", "11111111111", 1000.0)

    println("Funcionário ${Bruno.nome}, portador do CPF ${Bruno.cpf} recebe R$ ${Bruno.salario}")
    println("A bonificacao esse mês será de: R$ ${Bruno.bonificacao()}")
}