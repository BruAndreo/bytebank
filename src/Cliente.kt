class Cliente(val nome: String, val cpf: String, val senha: Int) : AutenticaImpl{

    override fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }

}