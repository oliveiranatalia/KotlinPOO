package poo.aula22.loja

abstract class Item(val nome:String, val preco:Double, val codigo:Int){
    abstract fun mostrarDetalhesDoItem()

    override fun equals(other: Any?): Boolean {
        return codigo == other
    }
}