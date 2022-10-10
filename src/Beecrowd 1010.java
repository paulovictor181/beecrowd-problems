import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int codigo1 = scan.nextInt();
        int qtd1 = scan.nextInt();
        double valorDoProduto1 = scan.nextDouble();

        int codigo2 = scan.nextInt();
        int qtd2 = scan.nextInt();
        double valorDoProduto2 = scan.nextDouble();

        double valorTotal = ((qtd1 * valorDoProduto1) + (qtd2 * valorDoProduto2));

        System.out.printf("VALOR A PAGAR: R$ %.2f\n" , valorTotal );
        

        scan.close();
    }
}