package poo.aula23.geometria

import kotlin.system.exitProcess

class Menu {

    fun menu() {
        print(
            "\n-------------------------------------------------------\n             Calcular figuras geometricas" +
            "\n-------------------------------------------------------\n\nInsira a referência de como deseja " +
            "prosseguir:\n\nQuadrado (q)  Retangulo (r)  Losango (l)  Triangulo (t)  Sair (s)   ->  ")
        val opcao = readln()
        if (opcao == "s") {
            println("\nFechando, até mais ....")
            exitProcess(0)
        } else if(opcao != "q" && opcao != "r" && opcao != "l" && opcao != "t"){
            println("\nCarregando ... \nNão consegui reconhecer esse valor. Tente novamente.")
            menu()
        }else {
            print("\nInsira a primeira medida: ")
            val b = readln().toDouble()
            print("Insira a segunda medida: ")
            val h = readln().toDouble()
            when (opcao) {
                "q" -> {
                    val calcularQuadrado = Quadrado(b, h).receberMedidas()
                    menu()
                }
                "r" -> {
                    val calcularRetangulo = Retangulo(b, h).receberMedidas()
                    menu()
                }
                "l" -> {
                    val calcularLosango = Losango(b, h).receberMedidas()
                    menu()
                }
                "t" -> {
                    val calcularTriangulo = Triangulo(b, h).receberMedidas()
                    menu()}
            }
        }
    }
}