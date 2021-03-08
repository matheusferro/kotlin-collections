import java.text.CollationElementIterator

fun main(args: Array<String>) {

    //Criando um Map
    var pedidos: Map<Int, Double> = mapOf<Int, Double>(Pair(1, 20.0), Pair(2, 45.0), 3 to 50.0)
    println(pedidos)

    //Leitura
    var pedido: Double? = pedidos[0]
    pedido?.let {
        print("Pedido $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidos){
        println("Número do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
    }
}