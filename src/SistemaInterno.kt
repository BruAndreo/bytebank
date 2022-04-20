class SistemaInterno {

    fun login(funcionarioAdmin: FuncionarioAdmin, senha: Int) {
        if (funcionarioAdmin.autenticar(senha)) {
            println("${funcionarioAdmin.nome} --> Autenticado")
        } else {
            println("${funcionarioAdmin.nome} --> Falhou na autenticação")
        }
    }

}
