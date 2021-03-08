import java.text.CollationElementIterator

fun main(args: Array<String>) {
    var assistiramCursoAndroid: List<String> = listOf("Matheus","Jorge","Pedro","João")
    var assistiramCursoKotlin: List<String> = listOf("Matheus","Vitor","Paulo","João")
    var assistiramDoisCursos: List<String> = assistiramCursoAndroid + assistiramCursoKotlin
    println(assistiramDoisCursos.distinct())
}