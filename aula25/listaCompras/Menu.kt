package poo.aula25.listaCompras

import kotlin.system.exitProcess

class Menu {
    fun menuPrincipal(carrinho:Carrinho){
        try{
            print("\nInsira a refer�ncia de como deseja prosseguir:\n\n" +
                    "--Inserir produto no carrinho (i)\n" +
                    "----------Visualizar carrinho (v)\n" +
                    "---------------------Encerrar (e)\n ->  ")
            when (readln()) {
                "i" -> {val i = carrinho.inserirCarrinho()
                    menuPrincipal(carrinho)}
                "v" -> {val v = carrinho.exibirCarrinho()
                    menuPrincipal(carrinho)}
                "e" -> {println("\nFechando, at� mais ....")
                    exitProcess(0)}
                else -> {throw IllegalArgumentException ("Valor inv�lido")
                }
            }
        }catch(e:Exception){
            print(e.message)
            menuPrincipal(carrinho)
        }
    }
}