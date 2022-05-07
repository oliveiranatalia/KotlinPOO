package poo.aula23.banco

fun main (){
    val a = ContaCorrente()
    val b = SeguroDeVida()
    val c = ContaPoupanca()
    println("Saldo de conta corrente é de ${a.saldo}")
    println("Saldo de conta corrente atualizado é de ${a.recolherTributos()}")
    println("Saldo de seguro de vida é de ${b.saldo}")
    println("Saldo de seguro de vida atualizado é de  ${b.recolherTributos()}")
    println("Saldo de conta poupança é de ${c.saldo}")
    println("Saldo de conta poupança atualizado é de ${c.saldo}")
}