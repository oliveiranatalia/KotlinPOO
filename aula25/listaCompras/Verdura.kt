package poo.aula25.listaCompras

class Verdura(val gramas:Double,val nome: String) {
    override fun toString(): String {
        return "nome: $nome | $gramas kg"
    }
}