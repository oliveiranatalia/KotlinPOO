package poo.aula25.listaCompras

import kotlin.system.exitProcess

class Menu {
    fun menu(carrinho:Carrinho){
        try{
            print("\nInsira a referência de como deseja prosseguir:\n\n" +
                    "--Inserir produto no carrinho (i)\n" +
                    "----------Visualizar carrinho (v)\n" +
                    "---------------------Encerrar (e)\n ->  ")
            when (readln()) {
                "i" -> {val i = carrinho.inserirCarrinho()
                    menu(carrinho)}
                "v" -> {val v = carrinho.exibirCarrinho()
                    menu(carrinho)}
                "e" -> {println("\nFechando, até mais ....")
                    exitProcess(0)}
                else -> {throw IllegalArgumentException ("Valor inválido")
                }
            }
        }catch(e:Exception){
            print(e.message)
            menu(carrinho)
        }
    }
}
