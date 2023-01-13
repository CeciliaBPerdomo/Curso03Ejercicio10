public class Main {
    public static void main(String[] args) {
        // Operaciones aritmeticas (suma, resta, etc.. )
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 40; 

        int resultado = numero1 + numero2;
        double iva = resultado * 0.23;
        double total = resultado + iva;

        System.out.println("Subtotal: " + resultado);
        System.out.println("Iva: " + iva);
        System.out.println("Total: " + total);

        int resultadoResta = numero2 - numero1;
        System.out.println("Resultado de resta: " + resultadoResta);
        System.out.println(" ");

        // Comparacion (Mayor, menor, igual, etc... )
        boolean resultado1 = numero2 > numero1;
        System.out.println("Es mayor: " + resultado1);

        // Operadores logicos (and, or)
        boolean resultado2 = numero2 > numero1 && numero3 < numero2;
        System.out.println("Es mayor: " + resultado2);

        int edad = 17; 
        boolean carnetJoven = edad >= 15 && edad <= 26;
        System.out.println("Carnet Joven: " + carnetJoven);
    }
}