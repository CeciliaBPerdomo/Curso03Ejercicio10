import java.io.IOException;

public class DividePorCero {
    public static void main(String[] args) {
        // 8. Crea una función DividePorCero. Esta, debe generar una excepción ("throws") 
        // a su llamante del tipo ArithmeticException que será capturada por su llamante 
        // (desde "main", por ejemplo). Si se dispara la excepción, mostraremos el mensaje 
        // "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Ejercicio 8: Division por cero"); 
        System.out.println(" "); 

        try {
            divide(24,0);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse: " + e);
        } finally{
            System.out.println("Demo de codigo");            
        }

        System.out.println(" "); 
        System.out.println("-------------------------------------------------------------------");

    }

    public static int divide(int A, int B) throws ArithmeticException, IOException {
        int resultado = 0;
        try {
            resultado = A / B;
        } catch(ArithmeticException e) {
            throw new IOException();
        }
        return resultado;
    }
}
