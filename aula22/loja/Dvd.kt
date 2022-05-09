package poo.aula22.loja

class Dvd(nome: String, preco: Double, codigo: Int, val duracao:Double) :Item(nome, preco, codigo) {
    override fun mostrarDetalhesDoItem() {
        println("Título $nome - Valor: R$ $preco - ${duracao}h de duração")
    }
}