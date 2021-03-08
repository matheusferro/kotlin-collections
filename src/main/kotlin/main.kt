fun main(args: Array<String>) {
    val banco = BancoDeNomes()
    banco.salva("Thais")
    /**
     * Somente com o recurso utilizado não
     * evita de nossa lista ser alterada.
     */
    val listaMutavelCopia: MutableList<String> = banco.nomes as MutableList<String>
    listaMutavelCopia.add("Hack3r")
    println(listaMutavelCopia)
    println(banco.nomes)
}

class BancoDeNomes{

    /**
     * Externaliza uma variavel "copia"
     * do objeto que nos manipulamos internamente.
     */
    val nomes: Collection<String> get() = dadosInterno

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