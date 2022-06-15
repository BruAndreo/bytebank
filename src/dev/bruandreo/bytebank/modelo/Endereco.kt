package dev.bruandreo.bytebank.modelo

class Endereco (
    var logradouro: String = "",
    var numero: String = "",
    var cidade: String = "",
    var complemento: String = ""
) {
    fun completo(): String {
        return """$logradouro, $numero $complemento- $cidade""".trimIndent()
    }
}
