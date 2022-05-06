package poo.aula24.collection.exercicios

class Cores {

    fun listaCores(): HashMap<String, String> {
        val dicionario = HashMap<String, String>()
        dicionario["Lisa Simpson"] = "Amarelo"
        dicionario["Garnet"] = "Vinho"
        dicionario["Mérida"] = "Laranja"
        dicionario["Bruno Madrigal"] = "Verde"
        return dicionario
    }
}