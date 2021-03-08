import java.text.CollationElementIterator

fun main(args: Array<String>) {

    //Criando um Map
    var pedidos: MutableMap<Int, Double> = mutableMapOf<Int, Double>(Pair(1, 20.0), Pair(2, 45.0), 3 to 50.0)
    println(pedidos)

    //Leitura
    var pedido: Double? = pedidos[0]
    pedido?.let {
        print("Pedido $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos){
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }

    //Inserindo elemento
    pedidos[4] = 74.2
    println(pedidos)
    pedidos.put(5, 100.3)
    println(pedidos)
    //Alterando
    pedidos.put(5, 300.3)
    //Adicionando se não for repetido
    pedidos.putIfAbsent(5, 300.3)
    println(pedidos)
    //Removendo, só por chave e por chave-valor
    pedidos.remove(5)
    pedidos.remove(4, 50.0)
    println(pedidos)
}