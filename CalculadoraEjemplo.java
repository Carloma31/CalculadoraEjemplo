package tarea6dpl;

/**
 * La clase <code>CalculadoraEjemplo</code> simula una calculadora con las operaciones matemáticas básicas.
 * 
 * Esta clase permite realizar operaciones de suma, resta, multiplicación y división con dos operandos. 
 * Los operandos y el resultado se manejan a través de los atributos de la clase. Los métodos implementan las operaciones básicas y 
 * retornan los resultados de dichas operaciones.
 * 
 * @author carlos
 * @version 1.0
 * @since 2024-11-06
 * @see java.lang.Math
 */
public class CalculadoraEjemplo {

    //Creamos los atributos
    int operando1;
    int operando2;
    int resultado;

     /**
     * Constructor de la clase.
     * 
     * Este constructor inicializa los operandos de la calculadora con los valores proporcionados
     * como parámetros.
     *
     * @param operando1 El primer operando para las operaciones matemáticas.
     * @param operando2 El segundo operando para las operaciones matemáticas.
     */
    public CalculadoraEjemplo(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

     /**
     * Método principal para ejecutar la calculadora.
     * 
     * Este método crea un objeto de la clase {@link CalculadoraEjemplo}, 
     * 
     * En ella se realizan las operaciones básicas de suma,resta,división y multiplicar
     * @param args Los argumentos de línea de comandos, no se usan en este caso.
     */
    public static void main(String[] args) {
        //Creamos el objeto como se pide en el enunciado del ejercicio
        CalculadoraEjemplo calculadora = new CalculadoraEjemplo(3, 6);

        System.out.println("Aqui modificamos un nuevo systemout para el commit 2");
        System.out.println("El resultado de la suma es: " + calculadora.Suma());
        System.out.println("El resultado de la resta es: " + calculadora.Resta());
        System.out.println("El resultado de la multiplicación es: " + calculadora.Multiplicar());
        System.out.println("El resultado de la división es: " + calculadora.Dividir());
    }

     /**
     * Realiza la suma de los operandos definidios.
     * 
     * Este método toma los dos operandos de la clase y devuelve el resultado de su suma.
     * 
     * @return El resultado de la suma de {@link operando1} y {@link operando2}.
     */
    public int Suma() {
        resultado = operando1 + operando2;
        return resultado;
    }

     /**
     * Realiza la resta de los operandos definidios.
     * 
     * Este método toma los dos operandos de la clase y devuelve el resultado de su resta.
     * 
     * @return El resultado de la resta de {@link operando1} y {@link operando2}.
     */
    public int Resta() {
        resultado = operando1 - operando2;
        return resultado;
    }

     /**
     * Realiza la multiplicacion de los operandos definidios.
     * 
     * Este método toma los dos operandos de la clase y devuelve el resultado de su multiplicación.
     * 
     * @return El resultado de la multiplicación de {@link operando1} y {@link operando2}.
     */
    public int Multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

     /**
     * Realiza la división de los operandos definidios.
     * 
     * Este método toma los dos operandos de la clase y devuelve el resultado de su división.
     * Si el segundo operando es cero, el método muestra un error por consola y devuelve cero.
     * 
     * @return El resultado de la división de 
     * {@link operando1} entre {@link operando2}, 
     * o 0 si {@link operando2} es 0.
     */
    public double Dividir() {
        if (operando2 == 0) {
            System.out.println("Error: División por cero");
            return 0;  // Retorna 0 si la división por cero ocurre
        } else {
            resultado = operando1 / operando2;
            return (double) resultado;  // Devolvemos un valor tipo double
        }
    }
}
