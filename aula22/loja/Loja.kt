package poo.aula22.loja

fun main(){
    val produtos = ArrayList<Item>()
    val livro1 = Livro("Admirável mundo novo", 34.59, 1543,"Aldous Huxley")
    val livro2 = Livro("Os mandarins", 45.99, 1544,"Virginia Woolf")
    val cd = Cd("Belo - Desafio", 30.99,1545,16)
    val dvd = Dvd("Shrek", 19.90,1546,1.29,)
    val livro3 = Livro("Sexual politics", 89.99,1447,"Kate Millett")
    produtos.add(livro1)
    produtos.add(livro2)
    produtos.add(livro3)
    produtos.add(cd)
    produtos.add(dvd)

    val cd2 = Cd("Master of Puppets", 35.99, 1447, 8)

    produtos.forEach {index ->
        index.mostrarDetalhesDoItem()
        println("Código semelhante a 1447: ${index.equals(cd2.codigo)}\n")
    }
}