package main

class Pessoa{
    var nome: String = "Elton"
    var cpf: String = "123.123.123-01"
    private set

    //Interpolação
    fun pessoaInfo() = "$nome e $cpf"

}
fun main() {
    val elton = Pessoa()

    println(elton.pessoaInfo())

}
