/**
 * Función principal
 */
fun main() {
    val persona1 = Persona(78.6, 1.80 )
    val persona2 = Persona("Antonio", 90.0, 1.69)
    val persona3 = Persona("Lucía", 64.9, 1.70)

    persona1.mostrarDesc() //Sin nombre
    persona1.cambiarNombre()
    println(persona1.toString()) // Nombre cambiado
    println()
    persona2.mostrarDesc()
    println()
    persona3.mostrarDesc()
    println() // Cambio altura persona3
    persona3.altura = 1.80
    persona3.mostrarDesc()

    /**
     * Compara la altura de la persona2 y la persona3
     */
    fun comparador(){

        if (persona2.altura == persona3.altura){
            println("${persona2.nombre} y ${persona3.nombre} tienen la misma altura.")
        }
        else if(persona2.altura < persona3.altura){
            println("${persona3.nombre} es más alto que ${persona2.nombre}")
        }
    }

    persona2.altura = persona3.altura
    comparador()

}


