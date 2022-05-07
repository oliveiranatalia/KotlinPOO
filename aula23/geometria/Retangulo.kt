package poo.aula23.geometria

class Retangulo(override var b: Double, override var h: Double) :FiguraGeometrica {
    fun receberMedidas(){
        val resultado =  b * h
        println("A area do retângulo é $resultado.")
    }
}