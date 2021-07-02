package main.teste

import main.Gerente

fun main() {

    val isa = Gerente("Isa", "99999999999", 5000.00, "123")
    ImprimeRelatorioFuncionario.imprime(isa)

    TesteAutenticacao().autentica(isa)

}