import java.io.IOException;
import java.util.Scanner; 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner scan = new Scanner(System.in);
        int valor01 = scan.nextInt();
        int valor02 = scan.nextInt();

        int PROD = valor01 * valor02;

        System.out.println("PROD = " + PROD);

        scan.close();
 
    }
 
}