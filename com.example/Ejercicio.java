public class Ejercicio {
    // Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    public static void main(String[] args) {
        System.out.println("Ejercicio: Crear una funcion que reciba un precio y devuelva el precio con el IVA incluido.");
        
        double precio = 100;
        // Calculo del Total
        double total = getPrice(precio);
        System.out.println("El precio es de: " + precio);
        System.out.println("El total mas IVA es de: " + total);
    }

    static double getPrice(double price){
        return price * 1.23;
    }
}
