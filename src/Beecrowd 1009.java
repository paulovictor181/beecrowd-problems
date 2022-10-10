import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        double salario = scan.nextDouble();
        double valorTotalVendas = scan.nextDouble();

        double salarioTotal = (salario + (valorTotalVendas * 0.15));

        System.out.printf("TOTAL = R$ %.2f\n" , salarioTotal );
        

        scan.close();
    }
}