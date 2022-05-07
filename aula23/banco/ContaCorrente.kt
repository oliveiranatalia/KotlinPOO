package poo.aula23.banco

class ContaCorrente:Tributos {
    var saldo = 2.500
    override fun recolherTributos(): Double {
        return saldo - (saldo * 0.01)
    }
}