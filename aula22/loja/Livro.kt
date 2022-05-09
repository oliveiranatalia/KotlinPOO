package poo.aula22.loja

class Livro(nome: String, preco: Double, codigo: Int, val autor:String) :Item(nome, preco, codigo) {
    override fun mostrarDetalhesDoItem(){
        println("T�tulo $nome - Valor: R$ $preco - Autoria: $autor")
    }
}