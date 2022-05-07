package poo.aula23.banco

class SeguroDeVida:Tributos {
    val saldo = 10.700
    override fun recolherTributos(): Double {
        return saldo - .042
    }
}