package poo.aula24

fun main(){

    val ex1 = ArrayList<Int>()
    ex1.add(1)
    ex1.add(5)
    ex1.add(5)
    ex1.add(6)
    ex1.add(7)
    ex1.add(8)
    ex1.add(8)
    ex1.add(8)
    println("\nLista do exercício1: $ex1")

    val ex2 = mutableSetOf<Int>()
    ex2.add(1)
    ex2.add(5)
    ex2.add(5)
    ex2.add(6)
    ex2.add(7)
    ex2.add(8)
    ex2.add(8)
    ex2.add(8)
    println("\nLista do exercício2: $ex2")

    println("\nA diferença do exercício 1 para o 2 é que o 1 foi feito com ArrayList e o 2 com mutableSet.\n" +
            "Interface Set não permite repetições de elementos.")
}