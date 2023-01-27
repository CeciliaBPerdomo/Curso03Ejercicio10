import java.util.ArrayList;
import java.util.LinkedList;

public class EjercicioArrayList {
    public static void main(String[] args) {
        // 6. Crea un ArrayList de tipo String, con 4 elementos. 
        // Cópialo en una LinkedList. 
        // Recorre ambos mostrando únicamente el valor de cada elemento.

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Ejercicio 6: ArrayList y LinkedList"); 
        System.out.println(" "); 

        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Cecilia");
        lista.add("Omar");
        lista.add("Bruno");
        lista.add("Camila");
        lista.add("Emma");

        System.out.println("Contenido del ArrayList: " + lista);

        System.out.println(" "); 
        for(String nombre: lista){
            System.out.println("Recorriendo el ArrayList: " + nombre);
        }

        System.out.println(" "); 

        LinkedList <String> listaEnlazada = new LinkedList<>(lista);
        System.out.println("Contenido de la LinkedList: " + listaEnlazada);

        for(String nombre: listaEnlazada){
            System.out.println("Recorriendo la LinkedList: " + nombre);
        }


        // 7. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. 
        // A continuación, con otro bucle, recórrelo y elimina los numeros pares. 
        // Por último, vuelve a recorrerlo y muestra el ArrayList final. 
        // Si te atreves, puedes hacerlo en menos pasos, siempre y 
        // cuando cumplas el primer "for" de relleno.
        
        System.out.println(" "); 
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Ejercicio 7: ArrayList Int"); 
        System.out.println(" "); 

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println("Contenido del ArrayList: " + numeros);

        for (int i = 1; i < 11; i++){
            numeros.add(i);
        }

        System.out.println("Contenido del ArrayList (despues del for): " + numeros);

        for (int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) % 2 == 0){
                numeros.remove(i);
                continue;
            }
        }
        
        System.out.println("Contenido del ArrayList (despues de eliminar los pares): " + numeros);
    }
}
