package poo.aula23.banco

fun main (){
    val a = ContaCorrente()
    val b = SeguroDeVida()
    val c = ContaPoupanca()
    println("Saldo de conta corrente � de ${a.saldo}")
    println("Saldo de conta corrente atualizado � de ${a.recolherTributos()}")
    println("Saldo de seguro de vida � de ${b.saldo}")
    println("Saldo de seguro de vida atualizado � de  ${b.recolherTributos()}")
    println("Saldo de conta poupan�a � de ${c.saldo}")
    println("Saldo de conta poupan�a atualizado � de ${c.saldo}")
}