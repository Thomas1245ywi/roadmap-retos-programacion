
/*
 * EJERCICIO:
 * - Crea ejemplos de funciones básicas que representen las diferentes
 *   posibilidades del lenguaje:
 *   Sin parámetros ni retorno, con uno o varios parámetros, con retorno...
 * - Comprueba si puedes crear funciones dentro de funciones.
 * - Utiliza algún ejemplo de funciones ya creadas en el lenguaje.
 * - Pon a prueba el concepto de variable LOCAL y GLOBAL. 
 * - Debes hacer print por consola del resultado de todos los ejemplos.
 *   (y tener en cuenta que cada lenguaje puede poseer más o menos posibilidades)
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
 *
 * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
 * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
 */


public class Thomas1245ywi {

    // que signfica el metodo principal de Java
    // main: es el nombre e indica que es el metodo principal y empieza a ejecutar desde ahi
    // void: No devuelve nada
    // static: significa que el metodo pertenece a la clase
    // Calse:  molde o plantilla
    // metodo: que hace

    // Varibles Globales y Locales
    // Globales se pueden acceder desde caulquier lugar
    // Locales solo existen dentro del bloque {}

    // Ejemoplo de variable global - se crea en la clase no el metodo
    static int variableGlobal = 10000;

    public static void main(String[] args) { 
        Thomas1245ywi.saludar();
        Thomas1245ywi.sumar(2, 2);
        System.out.println(Thomas1245ywi.multiplicar(2, 6));

        // Usando funciones ya creadas del lenguaje

        String empresa = "Samsung";

        System.out.println(empresa.length());//cantidad de caracteres
        System.out.println(empresa.toUpperCase());//a Mayusculas
        System.out.println(empresa.toLowerCase());//a Minusculas
        System.out.println(empresa.equals("Jose"));
        System.out.println(variableGlobal);

        

        // Aqui Visual Studio me marca error porque esta variable porque solo existe local en el metodo saludar
        //System.out.println(nombre);
        
        // Una particularidad es que las variables creadas por ejemplo en un if solo existen en el if
        /* 
       
        if(true){
            String varLocalisima = "odi odi";
        }

        System.out.println(varLocalisima);
        */
        



        /* DIFICULTAD EXTRA (opcional):
        * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
        * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
        *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
        *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
        *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
        *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
        *
        * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
        * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
        */ 

        //Convenciones:
        //Clase       → PascalCase
        //Variable    → camelCase
        //Método      → camelCase
        //Constante   → MAYUSCULAS

        String text1 = "Este numero es multiplo de 3";
        String text2 = "Este numero es multiplo de 5";


        int vecesNumero = ejercicioClase(text1, text2);
        System.out.println("Los numeros se mostraron: " + vecesNumero + " veces");


        
    }

    
    // Metodo sin parametros ni retorno
    static void saludar(){

        //ejemplo de una variable local
        String nombre = "Alejito";
        System.out.println(nombre);
    }

    // Metodo con parametros ni retorno

    static void sumar(int a, int b){
        System.out.println(a + b);

    }

   // Metodo con parametros y retorno
    
    static int multiplicar(int a, int b){
        return a * b;

    }

    // No se puede crear una funcion dentro de otra funcion}

    //Ejercicio

    static int ejercicioClase(String text1, String text2){

        int contador = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){

                System.out.println(text1 + text2);

            }else if(i % 3 == 0){

                System.out.println(text1);

            }else if (i % 5 == 0){

                System.out.println(text2);

            }else{
                System.out.println(i);
                contador++;

            }
        }


        return contador;

    }

}
