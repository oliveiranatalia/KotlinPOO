package poo.aula22.loja

class Dvd(nome: String, preco: Double, codigo: Int, val duracao:Double) :Item(nome, preco, codigo) {
    override fun mostrarDetalhesDoItem() {
        println("T�tulo $nome - Valor: R$ $preco - ${duracao}h de dura��o")
    }
}