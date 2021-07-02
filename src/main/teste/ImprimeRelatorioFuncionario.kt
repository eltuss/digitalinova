package main.teste

import main.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprime(funcionario: Funcionario) = println(funcionario.toString())
    }
}