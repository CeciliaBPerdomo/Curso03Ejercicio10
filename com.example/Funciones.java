public class Funciones {
    public static void main(String[] args) {
        // Funciones: bloque de codigo que se puede repetir
        
        // Opcion 1: Sin parametros y sin tipo de retorno
        System.out.println("Funcion sin parametros y sin tipo de retorno");
        showMenu();
        System.out.println(" "); 

        // Opcion 2: Sin parametros y con tipo de retorno
        System.out.println("Funcion sin parametros y con tipo de retorno");
        String menu = getMenu();
        System.out.println(menu);

        double price = getPrice();
        System.out.println("El precio es: " + price);
        System.out.println(" "); 

        // Opcion 3: Con parametros y sin tipo de retorno
        System.out.println("Funcion con parametros y sin tipo de retorno");
        imprimirSaludoBuenosDias("Cecilia");
        System.out.println(" "); 

        // Opcion 4: Con parametros y con tipo de retorno
        System.out.println("Funcion con parametros y con tipo de retorno");
        String saludo = obtenerSaludo("Cecilia", "Perdomo");
        System.out.println(saludo);

        int resultadoSuma = suma(50, 200);
        System.out.println("La suma es de: " + resultadoSuma);
        System.out.println(" "); 

        // Opcion 5: Funciones anonimas (Funcion flecha)
        // Opcion 6: Funciones de sobrecarga, permite duplicar un metodo cuando tengan diferente 
        // numero o tipo de parametros. 
        System.out.println("SobreCarga");
        int resultadoSuma3 = suma(50, 60, 70);
        System.out.println("La suma con tres parametros es de: " + resultadoSuma3);
        System.out.println(" "); 
    }

    static int suma(int i, int j) {
        return i + j;
    }

    // Funcion de sobrecarga (Mismo nombre, distinta cantidad de parametros)
    static int suma(int i, int j, int k) {
        return i + j + k;
    }

    private static String obtenerSaludo(String nombre, String apellido) {
        return "Buenos tardes " + nombre + " " + apellido + "!";
    }

    private static void imprimirSaludoBuenosDias(String nombre) {
        System.out.println("Buenos dias " + nombre + "!");
    }

    private static double getPrice() {
        return 100.99;
    }


    static void showMenu(){
        System.out.println("Bienvenidos al E-Commerce de zapatillas");
        System.out.println("1. Ver Zapatillas");
        System.out.println("2. Comprar zapatillas");
        System.out.println("3. Salir");
    }

    static String getMenu() {
        // \n Salta de linea
        return "Bienvenidos al E-Commerce de zapatillas.\n1. Ver Zapatillas. \n2. Comprar zapatillas. \n3. Salir.";
    }
}
