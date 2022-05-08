package poo.aula23.geometria

class Retangulo(override var b: Double, override var h: Double) : FiguraGeometrica {
    override fun calcularMedidas(){
        val resultado =  b * h
        println("A area do retângulo é $resultado.")
    }
}
