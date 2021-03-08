import java.text.CollationElementIterator

fun main(args: Array<String>) {
    //utilizando o elemento set, que é uma lista de elementos unicos
    var assistiramCursoAndroid: Set<String> = setOf("Matheus","Jorge","Pedro","João")
    var assistiramCursoKotlin: List<String> = listOf("Matheus","Vitor","Paulo","João")
    //Aqui a ordem importa, precisamos receber um Set. (set) = (set) + (list)
    var assistiramDoisCursos: Set<String> = assistiramCursoAndroid + assistiramCursoKotlin
    println(assistiramDoisCursos)

    var setMutavelAndroid: MutableSet<String> = mutableSetOf("Matheus","Jorge","Pedro","João")
    var setMutavelKotlin: MutableSet<String> = mutableSetOf("Matheus","Vitor","Paulo","João")
    setMutavelAndroid.add("Matheus") //Não vai ser adicionado, justamente por já existir o elemento "Matheus"
    setMutavelAndroid.add("Marcio") //Vai ser adicionado
    var doisSets: MutableSet<String> = mutableSetOf<String>()
    doisSets.addAll(setMutavelAndroid)
    doisSets.addAll(setMutavelKotlin)
    println(doisSets)
}