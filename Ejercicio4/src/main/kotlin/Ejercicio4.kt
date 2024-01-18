/*Ejercicio 4.4

·Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de caballos, el número de puertas y la matrícula. Crear el constructor del coche, así como los métodos estándar: getters, setters y toString().

·Para realizar getters y setters, añade el modificador private a los atributos de la clase y genera los métodos getColor(), setColor(), ..., así para todos los atributos.

·En el programa principal, instancia varios coches, muestra su información, cambia el color a algunos de ellos y vuelve a mostrarlos por pantalla.

·Realiza también una modificación al método setNumCaballos() para que no permita actualizar el atributo numCaballos con un valor interior a 70, ni superior a 700.

·Realiza otra modificación al método setNumPuertas() para que no se pueda actualizar con un valor inferior a 3, ni superior a 5... pero esta vez utiliza require.

·Para probar las modificaciones a los métodos anteriores, solicita al usuario el número de caballos para un coche y haz lo mismo para el número de puertas.*/

class Coche(){

    var color: String = ""
    fun getColor(){}
    fun setColor(){}

    var marca: String = ""
    fun getMarca(){}
    fun setMarca(){}

    var modelo: String = ""
    fun getModelo(){}
    fun setModelo(){}

    var nCaballos: Int = 0
    fun getCaballos(){}
    fun setCaballos(){}

    var nPuertas: Int = 0
    fun getPuertas(){}
    fun setPuertas(){}

    var matricula: String = ""
    fun getMatriculas(){}
    fun setMatriculas(){}



}