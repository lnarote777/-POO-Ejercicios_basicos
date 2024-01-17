/*Ejercicio 4.1

Crear una clase Persona que tenga nombre, peso (en kg con decimales), altura (en metros con decimales) y su imc.

Crear un constructor primario con todos los atributos, excepto nombre e imc. Este último atributo de la clase se calculará en un bloque init que situarás a continuación de la declaración del atributo.

Crear un constructor secundario que también incluya el nombre de la persona cómo parámetro.

En el main() crear 3 personas diferentes, utilizando el constructor primario y secundario, y realizar lo siguiente:

La persona1 debe modificar su nombre y para ello debes solicitarlo al usuario por consola.
Mostrar el nombre, peso y altura de la persona 2.
Actualizar imc de la persona3 haciendo el cálculo con su peso y altura.*/

class Persona(var nombre: String){
    var peso: Double = 0
}