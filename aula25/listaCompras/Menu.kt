package poo.aula25.listaCompras

import kotlin.system.exitProcess

class Menu {
    fun menuPrincipal(){
        try{
            print("\nInsira a referência de como deseja prosseguir:\n\n" +
                    "--Inserir produto no carrinho (i)\n" +
                    "----------Visualizar carrinho (v)\n" +
                    "---------------------Encerrar (e)\n ->  ")
            when (readln()) {
                "i" -> {val i = Carrinho().inserirCarrinho()
                    menuPrincipal()}
                "v" -> {val v = Carrinho().exibirCarrinho()
                    menuPrincipal()}
                "e" -> {println("\nFechando, até mais ....")
                    exitProcess(0)}
                else -> {throw IllegalArgumentException ("Valor inválido")
                }
            }
        }catch(e:Exception){
            print(e.message)
            menuPrincipal()
        }
    }
}
