import java.util.Vector;

public class EjercicioVector {
    public static void main(String[] args) {
        // 4. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.  
        // Elimina el 2o y 3er elemento y muestra el resultado final.

        Vector<String> vector = new Vector<>();
        vector.add("Cecilia");
        vector.add("Omar");
        vector.add("Bruno");
        vector.add("Camila");
        vector.add("Emma");

        System.out.println("Datos del vector: " + vector);

        vector.remove(1);
        vector.remove(1);
        System.out.println("Datos del vector (después del remove): " + vector);

        // 5. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si 
        // tuviésemos 1000 elementos para ser añadidos al mismo.

        System.out.println("Vector de tamaño: " + vector.size() + " y capacidad: " + vector.capacity());
        System.out.println("Si su tamaño de 1000, duplicaria su capacidad");
    }
}
