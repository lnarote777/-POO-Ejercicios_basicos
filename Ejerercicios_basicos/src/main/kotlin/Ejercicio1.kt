/*Ejercicio 4.1
·Crear una clase Persona que tenga nombre, peso (en kg con decimales), altura (en metros con decimales) y su imc.

·Crear un constructor primario con todos los atributos, excepto nombre e imc. Este último atributo se calcula en función del peso y la altura. Por tanto no se debe poder modificar, pero si consultar.

·Crear un constructor secundario que también incluya el nombre de la persona cómo parámetro.

·Implementa el método toString, representación del objeto en forma de String: override fun toString() = ""

·En el main() a) crear 3 personas diferentes (la primera sin nombre) utilizando el constructor primario y secundario y b) mostrarlas por consola. A continuación, realizar lo siguiente:

    ·Sobre la persona 1: a) modificar su nombre y para ello debes solicitarlo al usuario por consola. No puede ser nulo o vacio. b) Mostrar por consola sólo el nombre, peso y altura.
    ·Sobre la persona 3: a) Mostrar el peso, altura y imc. b) Modificar la altura, por ejemplo a 1.80 c) Mostrar el peso, altura y imc.
    ·Sobre la persona 2; a) Modificar la altura para que tenga el mismo valor que la persona 3. b) Mostrar la persona 2 y persona 3. c) Comparar si las dos personas son iguales, y mostrar el resultado.
*/


class Persona(var peso: Double, var altura: Double){
    var nombre: String = "Sin nombre"
    val  imc : Double

    init {
        this.imc = this.peso / (this.altura * this.altura)
    }

    constructor(nombre: String, peso: Double, altura: Double) : this(peso, altura){
        this.nombre = nombre
    }

    fun mostrarDesc(){
        println("${this.nombre} tiene un peso de ${this.peso}kg, una altura de ${this.altura} y su imc es de ${"%.2f".format(this.imc)}.")
    }
    fun cambiarNombre() {
        do {
            println("Introduzca un nombre para cambiárselo a 'Sin nombre': ")
            val otroNombre = readln()
            if (otroNombre.isNotEmpty()){
                this.nombre = otroNombre
                break
            }
            else{
                println("**Nombre no válido** Este campo no puede estar vacío.")
            }
        }while (true)
    }

    override fun toString(): String{
        return "${this.nombre} tiene un peso de ${this.peso}kg, una altura de ${this.altura}."
    }
}