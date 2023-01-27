import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class InputPrint {
    public static void main(String[] args) {
        // 9. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:
        // "fileIn" y "fileOut". La tarea de la función será realizar la copia del fichero dado
        // en el parámetro "fileIn" al fichero dado en "fileOut".

        try {
            InputStream fileIn = new FileInputStream("letra.txt");
            byte [] datos = fileIn.readAllBytes();

            for (byte dato: datos){
                System.out.print((char)dato);
            }

            PrintStream fileOut = new PrintStream("copiaFileIn.txt");
            fileOut.write(datos); 

            fileIn.close();
            fileOut.close();

        } catch(Exception e){
            System.out.println("Error: " + e);
        }     
    }
}
