package dev.bruandreo.bytebank.teste

fun main() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())

    val minhaFuncaoClasses: () -> Unit = Teste()
    println(minhaFuncaoClasses)

    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b -> a + b }
    println(minhaFuncaoLambda(10, 15))

    val minhaFuncaoAnonima = fun(a: Int, b: Int) : Int {
        return a + b
    }
    println(minhaFuncaoAnonima(10, 10))

    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 5000.0) {
            return@lambda salario + 50.0
        }
        return@lambda salario + 100.0
    }
    println(calculaBonificacao(1000.0))
}

fun teste() {
    println("Teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke do teste")
    }

}
