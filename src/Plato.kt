/*    El nombre del plato no puede ser vacío.
El precio del plato debe ser mayor que 0.
El tiempo de preparación no podrá ser igual o inferior a 1.
Un ingrediente no puede ser vacío.
Considerar el uso de propiedades de Kotlin para validar automáticamente estas restricciones tanto al crear un plato cómo al modificar sus valores.  */
class Plato(var nombre:String,
            var precio:Int,
            var tiempoPreparacion:Int,
            val ingredientes:MutableList<String>) {

    init {
        require(!nombre.isNullOrBlank()){"Nombre no puede ser blanco ni vacio"}
        require(precio > 0){"El precio no puede ser menor que 0"}
        require(ingredientes.null)

    }


    fun agregarIngredientes(ingrediente:String){
        try {
            if (ingrediente.isNullOrBlank()){
                throw IllegalArgumentException("El ingrediente no puede ser vacio ni blaco")
            }else{
                ingredientes.add(ingrediente)
            }
        }catch (e: IllegalArgumentException){
            e.message
        }
    }

    override fun toString(): String {
        return "$nombre ($tiempoPreparacion) -> $precio, $ingredientes"
    }
}