fun main(args: Array<String>) {

    val pedidos = listOf(
        Pedido(1, 200.0),
        Pedido(2, 100.6),
        Pedido(3, 76.0),
        Pedido(4, 91.0),
        Pedido(5, 45.0),
    )

    println(pedidos)
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[1])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido -> pedido.valor >= 50 }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero=1, valor=200.0)])

    val pedidosAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido: Pedido -> pedido.valor >= 50 }
    println(pedidosAgrupados)
    println(pedidosAgrupados[true])
    println(pedidosAgrupados[false])

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }

    println(agenda)
    println(agenda['A'])

    val pedidosAgrupadosGrouping: Grouping<Pedido, Boolean> = pedidos.groupingBy { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosAgrupadosGrouping)
    println(pedidosAgrupadosGrouping.eachCount())
}

data class Pedido(val numero: Int, val valor: Double)