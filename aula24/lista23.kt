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
    println("\nLista do exerc�cio1: $ex1")

    val ex2 = mutableSetOf<Int>()
    ex2.add(1)
    ex2.add(5)
    ex2.add(5)
    ex2.add(6)
    ex2.add(7)
    ex2.add(8)
    ex2.add(8)
    ex2.add(8)
    println("\nLista do exerc�cio2: $ex2")

    println("\nA diferen�a do exerc�cio 1 para o 2 � que o 1 foi feito com ArrayList e o 2 com mutableSet.\n" +
            "Interface Set n�o permite repeti��es de elementos.")
}