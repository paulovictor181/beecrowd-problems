import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int tempo = scan.nextInt();
        int velocidade = scan.nextInt();
        int distancia =  velocidade * tempo;
        double gasolinaGasta = distancia / 12.0;

        System.out.printf("%.3f\n", gasolinaGasta);

        scan.close();
    }

}