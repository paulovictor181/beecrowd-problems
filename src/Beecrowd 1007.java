import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        

        double DIFERENCA = ((a*b)-(c*d));

        System.out.printf("DIFERENCA = %.0f\n" , DIFERENCA);

        scan.close();
    }
}