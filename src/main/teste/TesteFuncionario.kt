package main.teste

import main.Funcionario
import java.math.BigDecimal

fun main() {

    val eltuss = Funcionario("Elton", "12334314134", BigDecimal.valueOf(2000.00))
    println(eltuss.nome)
    println(eltuss.cpf)
    println(eltuss.salario)
}