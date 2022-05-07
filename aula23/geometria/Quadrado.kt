package poo.aula23.geometria

class Quadrado(override var b: Double, override var h: Double) :FiguraGeometrica{
    fun receberMedidas(){
        val resultado =  b * h
        println("A area do quadrado é $resultado.")
    }
}