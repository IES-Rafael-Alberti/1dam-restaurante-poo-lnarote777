class Plato(nombre: String, precio: Double, tiempoPreparacion: Int, ingredientes:
MutableList<String> ) {
    val nombre = nombre
    val precio = precio
    val tiempoPreparacion = tiempoPreparacion
    val ingredientes = ingredientes

    init {
        require(nombre.isNotBlank()){"El nombre del plato no puede estar vacío."}
        require(precio > 0){"El precio no puede se negativo."}
        require(tiempoPreparacion > 1) {"El tiempo de preparación no puede ser tan bajo."}
        require(ingredientes.isNotEmpty()){"No puede haber un ingrediente vacío."}
    }

    fun agregarIngrediente(ingrediente:String){
        ingredientes.add(ingrediente)

    }

    override fun toString(): String {
        return "${this.nombre} (${this.tiempoPreparacion} min.) -> ${this.precio}€ (${this.ingredientes})"
    }

}