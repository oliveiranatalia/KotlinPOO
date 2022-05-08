package poo.aula23.geometria

class Triangulo(override var b: Double, override var h: Double) : FiguraGeometrica {
    override fun calcularMedidas(){
        val resultado =  b * h / 2
        println("A area do triângulo é $resultado.")
    }
}
