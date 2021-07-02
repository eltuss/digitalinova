package main.teste

import main.Cliente
import main.ClienteTipo

fun main(){
    val elto = Cliente(
        nome = "elto barb",
        cpf = "3532624623",
        clienteTipo = ClienteTipo.PF,
        senha = "321"
    )
    println(elto)
    TesteAutenticacao().autentica(elto)
}