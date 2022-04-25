class SistemaInterno {

    fun login(user: AutenticaImpl, senha: Int) {
        if (user.autenticar(senha)) {
            println("Autenticado")
        } else {
            println("Falhou na autenticação")
        }
    }

}
