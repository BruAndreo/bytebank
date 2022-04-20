fun testaAutenticacao() {
    val sistemaInterno = SistemaInterno()

    val gerente = Gerente("Bruno", "111.111.111-11", 1000.0, 1234)
    val diretora = Diretor("Geovana", "222.222.222-22", 2000.0, 5678, 1000.0)

    sistemaInterno.login(gerente, 1234)
    sistemaInterno.login(diretora, 1234)
}