package poo.aula25.divisao

class CalculoMatematico {
    fun divisao(valor1: Int, valor2: Int): Int{
        return try{
            val resultado = valor1/valor2
            print("Para dividendo $valor1 e divisor $valor2, o resultado é $resultado")
            resultado
        }catch (e:ArithmeticException){
            print("Para dividendo $valor1 e divisor $valor2, a operação não pode ser realizada")
            0
        }
    }
}
