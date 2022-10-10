import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int distancia = scan.nextInt();
        double combustivel = scan.nextDouble();

        double distanciaPorCombustivel = distancia / combustivel;

        System.out.printf("%.3f km/l\n", distanciaPorCombustivel);

        scan.close();
    }

}