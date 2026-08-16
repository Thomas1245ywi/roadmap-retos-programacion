/*
 * EJERCICIO:
 * - Crea ejemplos utilizando todos los tipos de operadores de tu lenguaje:
 *   Aritméticos, lógicos, de comparación, asignación, identidad, pertenencia, bits...
 *   (Ten en cuenta que cada lenguaje puede poseer unos diferentes)
 * - Utilizando las operaciones con operadores que tú quieras, crea ejemplos
 *   que representen todos los tipos de estructuras de control que existan
 *   en tu lenguaje:
 *   Condicionales, iterativas, excepciones...
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
 *
 * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
 */

public class Thomas1245ywi {

    public static void main(String[] args) {
        //Tipos de Operadores
        // 1. Operadores Aritmeticos
        int suma = 5 + 1; 
        int resta = 5 - 3;
        int multiplicacion = 6 * 2;
        int division = 8 / 2;
        int modulo = 8 % 2;
        // 2. Operadores Logicos
        // Operador &&
        String tipoDocumento = "Cedula";
        int edad = 18;
        boolean esAdulto = (tipoDocumento == "Cedula" && edad > 17);
        System.out.println("¿El usuario es un adulto? " + esAdulto);
        // Operador ||
        String centroEstudios = "Javeriana";
        boolean tieneDescuento = (centroEstudios == "Politenico" || centroEstudios == "SENA");
        System.out.println("¿El usuario tiene descuento?" + tieneDescuento);
  


    }

    
}


