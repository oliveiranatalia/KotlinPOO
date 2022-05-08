package poo.aula23.geometria

class Quadrado(override var b: Double, override var h: Double) : FiguraGeometrica {
    override fun calcularMedidas(){
        val resultado =  b * h
        println("A area do quadrado é $resultado.")
    }
}
