package poo.aula25.listaCompras

fun main(){
    println("\n-------------------------------------------------------" +
        "\n                Lista de compras" +
        "\n-------------------------------------------------------")
    val carrinho = Carrinho()
    Menu().menu(carrinho)
}
