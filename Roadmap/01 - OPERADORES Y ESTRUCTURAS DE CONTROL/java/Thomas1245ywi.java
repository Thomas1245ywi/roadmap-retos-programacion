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

import java.util.List;

public class Thomas1245ywi {

    // Punto uno -----------------------------------------------------------------------------------------------------------------------------

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
        boolean puedeHacerTramite = tipoDocumento.equals("Cedula") && edad > 17;
        System.out.println("¿El usuario puede hacer el tramite? " + puedeHacerTramite);

        // Operador ||
        String centroEstudios = "Javeriana";
        boolean tieneDescuento = centroEstudios.equals("Politenico")|| centroEstudios.equals("SENA");
        System.out.println("¿El usuario tiene descuento?" + tieneDescuento);

        // Operador !
        boolean antecendentes = false;
        boolean esContratado = (!antecendentes);
        System.out.println("Fue contratado?" + esContratado);

        //3. Operadores de Asignacion
        int num1 = 1;
        System.out.println(num1);
        num1 += 5;
        System.out.println(num1);
        num1 -= 6;
        System.out.println(num1);

        //4. Operadores de identidad - comparan si un objeto es exactamente igual al otro
        // es super importante saber que == con numeros compara pero con texto compara si la variable esta en el mismo lugar(Si son la misma)
        // Por lo que para comparar textos se sugiere .equals

        String name = "Thomas";
        String name2 = new String("Thomas");

        boolean sonIguales = name == name2;
        boolean sonDiferentes = name != name2;

        System.out.println("Son iguales: " + sonIguales);
        

        //6. Operadores de bits

        // Operador &

        int num4 = 6; // en binario 0110
        int num5 = 3; // en binario 0011

        int resultado = num4 & num5; //0010
        System.out.println(resultado); 


        // Operador |

        resultado = num4 | num5; // 0111
        System.out.println(resultado); 


        // Operador <<

        resultado = num5 << 1;
        System.out.println(resultado); // 0110  

    // Punto tres -----------------------------------------------------------------------------------------------------------------------------
  
        // Estructuras de Control

        // Condicional

        edad = 18;

        if(edad >= 18){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Ustes es un niño aun");
        }


        // Ciclos

        //for

        for (int i = 1; i <= 10 ; i++){

            System.out.println(i);

        }

        //While

        int j = 0;

        while (j < 10) {
            j++;
            System.out.println(j);

        }

        //Do While

        j = 0;

        do{

            j++;
            System.out.println(j);
            

        }while(j < 10);

        /**Excepciones, se usa error cuando no se concoce el error en especifico 
        Cuando ya se conoce el error en cuestion categorizas mas especifico para 
        decirle al usuario con mayor claridad que esta pasando :)
        **/

        try{// intenta esto

            resultado = 10/1;
            System.out.println(resultado);
        
        }catch(Error error){ // Si falla muestra esto
            
            System.out.println("No se puede menso" + error.getMessage());

        }finally{ // esto se ejcutara siempre haya error o no

            System.out.println("Confirmo ejecucion");
        }


    // Ejercicio----------------------------------------------------------------------------------------------------------------------------
    /*
    * DIFICULTAD EXTRA (opcional):
    * Crea un programa que imprima por consola todos los números comprendidos
    * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
    *
    * Seguro que al revisar detenidamente las posibilidades has descubierto algo nuevo.
    */

    System.out.println("Este es el ejecicio para pros jeje");

    for(int k = 10; k <= 55; k++){

        if(k % 2 == 0 && k != 16 && k % 3 != 0){

                System.out.println(k);
                
            
        }

    }



    }

    
}


