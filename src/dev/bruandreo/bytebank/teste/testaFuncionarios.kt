import dev.bruandreo.bytebank.modelo.*

fun testaFuncionarios() {
    val bruno = Analista("Bruno", "11111111111", 2000.0)
    val bia = Analista("Beatriz", "22222222222", 2000.0)
    val rodrigo = Gerente("Rodrigo", "33333333333", 3000.0, senha = 123)
    val geovana = Diretor("Geovana", "44444444444", 4000.0, senha = 123, plr = 1000.0)

    imprimeInfos(bruno)
    imprimeInfos(bia)
    imprimeInfos(rodrigo)
    imprimeInfos(geovana)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(bruno)
    calculadora.registra(bia)
    calculadora.registra(rodrigo)
    calculadora.registra(geovana)

    println("Total de bonificaca será: R$ ${calculadora.total}")
}

fun imprimeInfos(funcionario: Funcionario) {
    println("Funcionário ${funcionario.nome}, portador do CPF ${funcionario.cpf} recebe R$ ${funcionario.salario}")
    println("A bonificacao esse mês será de: R$ ${funcionario.bonificacao}")
}