package poo.aula25.listaCompras

const val REGISTRADO = "\n---- Produto registrado com sucesso"
const val NOME = "Insira o nome do item: "
const val GRAMAS = "Insira a quantidade em gramas (0.500) : "
const val UNIDADES = "Insira a quantidade em unidades (5) : "

class Carrinho{
    val listaVerdura:ArrayList<Verdura> = ArrayList()
    val listaGrao: ArrayList<Graos> = ArrayList()
    val listaLegume: ArrayList<Legume> = ArrayList()
    val listaOutros: ArrayList<Outros> = ArrayList()

    fun inserirCarrinho(){
        try{
            print("\nInsira o tipo de produto que deseja inserir:\n(v) verduras - " +
                    "(g) grãos - (l) legumes - (o) outros ->")
            when(readln()){
                "v" ->inserirVerdura()
                "g" ->inserirGrao()
                "l" ->inserirLegume()
                "o" ->inserirOutro()
                else-> {
                    throw IllegalArgumentException("Tipo de alimento inválido")}
            }
        }catch(e:Exception){
            println(e.message)
            inserirCarrinho()
        }
    }
    fun exibirCarrinho() {
        if (listaVerdura.isNotEmpty()){println("${this.listaVerdura.toString()}\nA quantidade " +
                "de alimentos do tipo verdura a ser comprada é ${listaVerdura.size}")}
        if (listaGrao.isNotEmpty()) {println("${this.listaGrao.toString()}\nA quantidade de alimentos " +
                "do tipo grão a ser comprada é  ${listaGrao.size}")}
        if (listaLegume.isNotEmpty()) {println("${this.listaLegume.toString()}\nA quantidade de alimentos " +
                "do tipo legumes a ser comprada é  ${listaLegume.size}")}
        if (listaOutros.isNotEmpty()) {println("${this.listaOutros.toString()}\nA quantidade de alimentos" +
                " de outros tipos a ser comprada é ${listaOutros.size}")}
    }
    fun inserirVerdura(){
        try {
            print(GRAMAS)
            val gramas = readln().toDouble()
            if(gramas <= 0.0){
                println("Não é aceito valores menores ou igual a zero")
                inserirVerdura()
            }else {
                print(NOME)
                val nome = readln()
                if (nome.isEmpty()) {
                    throw UnsupportedOperationException("Não é permitido inserir valor vazio")
                } else {
                    val verdura = Verdura(gramas, nome)
                    listaVerdura.add(verdura)
                    println(REGISTRADO)
                }
            }
        }catch (e:NumberFormatException){
            println("Para verduras, a quantidade deve ser informada com ponto")
            inserirVerdura()
        }catch (e:UnsupportedOperationException){
            println(e.message)
        }
    }
    fun inserirGrao(){
        try{
            print(GRAMAS)
            val gramas = readln().toDouble()
            if(gramas <= 0.0){
                println("Não é aceito valores menores ou igual a zero")
                inserirGrao()
            }else {
                print(NOME)
                val nome = readln()
                if (nome.isEmpty()) {
                    throw UnsupportedOperationException("Não é permitido inserir valor vazio")
                } else {
                    val grao = Graos(nome, gramas)
                    listaGrao.add(grao)
                    println(REGISTRADO)
                }
            }
        }catch (e:NumberFormatException){
            println("Para grãos, a quantidade deve ser informada com ponto")
            inserirGrao()
        }catch (e:UnsupportedOperationException){
            println(e.message)
        }
    }
    fun inserirLegume(){
        try{
            print(UNIDADES)
            val unidade = readln().toInt()
            if(unidade <= 0){
                println("Não é aceito valores menores ou igual a zero")
                inserirLegume()
            }else {
                print(NOME)
                val nome = readln()
                if (nome.isEmpty()) {
                    throw UnsupportedOperationException("Não é permitido inserir valor vazio")
                } else {
                    val legume = Legume(nome, unidade)
                    listaLegume.add(legume)
                    println(REGISTRADO)
                }
            }
        }catch (e:NumberFormatException){
            println("Para legume, a quantidade deve ser informada em unidades inteiras.")
            inserirLegume()
        }catch (e:UnsupportedOperationException){
            println(e.message)
        }
    }
    fun inserirOutro(){
        try{
            print(UNIDADES)
            val unidade = readln().toInt()
            if(unidade <= 0){
                println("Não é aceito valores menores ou igual a zero")
                inserirOutro()
            }else {
                print(NOME)
                val nome = readln()
                if (nome.isEmpty()) {
                    throw UnsupportedOperationException("Não é permitido inserir valor vazio")
                } else {
                    val outro = Outros(nome, unidade)
                    listaOutros.add(outro)
                    println(REGISTRADO)
                }
            }
        }catch (e:NumberFormatException){
            println("Para outros, a quantidade deve ser informada em unidades inteiras.")
            inserirOutro()
        }catch (e:UnsupportedOperationException){
            println(e.message)
        }
    }
}