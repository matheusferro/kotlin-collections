fun main(args: Array<String>) {

    val listaImutavel: Collection<String> = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in listaImutavel){
        println(nome)
    }
    println(listaImutavel)
    println("Tem o nome Alex? ${listaImutavel.contains("Alex")}")
    /**
     * Comportamento .size nao é compativel com Iterable<>
     */
    println("Tamanho da coleção ${listaImutavel.size}")

}