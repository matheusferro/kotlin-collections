fun testaCopia() {
    val banco = BancoDeNomes()
    banco.salva("Thais")
    /**
     * Só possivel utilizar Collection
     */
    val listaMutavelCopia: Collection<String> = banco.nomes
    println(listaMutavelCopia)
    println(banco.nomes)
}

class BancoDeNomes{

    /**
     * Externaliza uma variavel "copia"
     * do objeto que nos manipulamos internamente.
     *
     * Adicionando o .toList() retorna uma cópia da lista interna
     * impossibilitando o casting.
     */
    val nomes: Collection<String> get() = dadosInterno.toList()

    fun salva(nome: String){
        dadosInterno.add(nome)
    }

    companion object{
        val dadosInterno = mutableListOf<String>()
    }
}

fun testaColecao() {
    val listaImutavel: Collection<String> = mutableListOf(
        "Alex",
        "Fran",
        "Gui",
        "Maria",
        "Ana"
    )
    for (nome in listaImutavel) {
        println(nome)
    }
    println(listaImutavel)
    println("Tem o nome Alex? ${listaImutavel.contains("Alex")}")
    /**
     * Comportamento .size nao é compativel com Iterable<>
     */
    println("Tamanho da coleção ${listaImutavel.size}")
}