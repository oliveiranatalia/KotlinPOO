package poo.aula22.loja

class Cd(nome: String, preco: Double, codigo: Int, val faixas :Int) :Item(nome, preco, codigo) {
    override fun mostrarDetalhesDoItem() {
        println("T�tulo $nome - Valor: R$ $preco - $faixas faixas")
    }
}