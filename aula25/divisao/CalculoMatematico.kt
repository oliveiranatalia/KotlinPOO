package poo.aula25.divisao

class CalculoMatematico {
    fun divisao():Int{
        try {
            val calcular = CalculoMatematico()
            print("Insira um número inteiro: ")
            val valor1 = readln().toInt()
            print("Insira um número inteiro: ")
            val valor2 = readln().toInt()
            val resultado = valor1 / valor2
            print("O resultado da operação é $resultado")
            return resultado
        }catch(exception: ArithmeticException){
            print("Operação não pode ser realizada")
            return 0
        }
    }
}