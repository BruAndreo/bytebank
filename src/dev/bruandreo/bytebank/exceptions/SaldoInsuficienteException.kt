package dev.bruandreo.bytebank.exceptions

class SaldoInsuficienteException(override val message: String = "Saldo insuficiente") : Exception(message)
