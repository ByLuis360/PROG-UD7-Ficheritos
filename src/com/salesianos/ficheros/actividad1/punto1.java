import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class punto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userText = "";

        while (userText.length() < 30) {
            System.out.println("Introduce un texto que de longitud sea 30 o más caracteres");
            userText = scanner.nextLine();
            System.out.println("El texto introducido tiene menos de 30 caracteres. Faltan " + (30 - userText.length())
                    + " caracteres.");
        }

        String newText = userText.toUpperCase().replace(" ", "_");

        String fileRoute = "src/com/salesianos/ficheros/fichero1.txt";

        try {
            BufferedOutputStream bufferd = new BufferedOutputStream(new FileOutputStream(fileRoute));
            for (int i = 0; i < newText.length(); i++) {
                bufferd.write(newText.charAt(i));
            }
            System.out.println("Se ha guardado exitosamente su archivo en la ruta " + fileRoute);
            bufferd.close();
        } catch (IOException e) {
            System.out.println("ERROR: Ha habido un error, reviselo");
        } finally {
            scanner.close();
        }
    }
}
