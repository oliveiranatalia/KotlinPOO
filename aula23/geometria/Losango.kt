package poo.aula23.geometria

class Losango(override var b: Double, override var h: Double) : FiguraGeometrica {
    override fun calcularMedidas(){
        val resultado =  b * h / 2
        println("A area do losango é $resultado.")
    }
}
