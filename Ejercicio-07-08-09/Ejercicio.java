public class Ejercicio {
    public static void main(String[] args) {
        // 1. Escribe el código que devuelva una cadena al revés. 
        // Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Ejercicio 1: Hola mundo"); 

        String reves = "Hola Mundo";
        String holaMundo[] = reves.split("");


        for (int i = holaMundo.length -1; i >= 0; i--) {
            System.out.print(holaMundo[i]);
        } 
       
        System.out.println(" ");
        System.out.println("-------------------------------------------------------------------");

        // 2. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        System.out.println("Ejercicio 2: array unidimensional de Strings");  
        
        String nombres[] = {"Cecilia", "Bruno", "Emma", "Camila"};
        for (String i: nombres){
            System.out.println(i);
        }

        System.out.println("-------------------------------------------------------------------");
        // 3. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y 
        // el valor de cada elemento en ambas dimensiones.
        
        System.out.println("Ejercicio 3: array bidimensional de enteros");
        int arrayBidi[][] = new int[2][4];
        arrayBidi[0][0] = 1;
        arrayBidi[0][1] = 2;
        arrayBidi[0][2] = 3;
        arrayBidi[0][3] = 4;

        arrayBidi[1][0] = 10;
        arrayBidi[1][1] = 20;
        arrayBidi[1][2] = 30;
        arrayBidi[1][3] = 40;

        for (int j = 0; j < arrayBidi.length; j++){
            for(int k = 0; k < arrayBidi[j].length; k++) {
                System.out.println("La posicion de j es: " + j + ", la posicion de k es: " + k + ". Valor en el array: " + arrayBidi[j][k]);
            }    
        }
  

    }
}