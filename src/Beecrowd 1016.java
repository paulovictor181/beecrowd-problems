import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int distancia = scan.nextInt();

        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");

        scan.close();
    }

}