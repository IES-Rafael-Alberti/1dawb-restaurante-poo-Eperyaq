/*Responsabilidades:

Mantener un registro de los platos pedidos por un cliente.
contPedidos: Int - No pertenece a ningún pedido en concreto, sino que es un valor global a todos y se utilizará para calcular automáticamente los números de los pedidos.

Propiedades:
numero: Int - El número de pedido será calculado automáticamente al crear cada pedido con respecto a un contador que existirá en la clase Pedido.
platos: List - Lista de platos que componen el pedido.
estado: String - Estado del pedido (por ejemplo, "pendiente", "preparación", "listo" y "servido"). Por defecto, todo pedido estará en estado pendiente.

Métodos:
agregarPlato(plato: Plato): Añade un nuevo plato al pedido.
eliminarPlato(nombrePlato: String): Elimina un plato del pedido basándose en el nombre.
calcularPrecio(): Calcula el precio total del pedido sumando los precios de cada plato.
calcularTiempo(): Calcula el tiempo total de preparación sumando el tiempo de preparación de cada plato.
toString(): Retornar la información del pedido utilizando el número de mesa, el método toString() de cada plato y su estado. (por ejemplo, "Hamburguesa (8 min.) -> 8.99€ (carne, huevo, queso, pan y tomate)")*/
class Pedido(val numero:Int,
            val platos:MutableList<Plato>,
            val estado:String = "Pendiente"
) {
    protected val contPedido:Int = ++contPedidos
    companion object{
        var contPedidos:Int = 0
    }

    fun agregarPlato(plato:Plato){
        platos.add(plato)
    }

    fun eliminarPlato(nombreplato:String){
        platos.find {  }

    }


}