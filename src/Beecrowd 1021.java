import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double valor = scan.nextDouble();
        double resto;

        int notas100 = (int) valor / 100;  
        resto = valor % 100;   
        int notas50 = (int) resto / 50;
        resto = resto % 50;
        int notas20 = (int) resto / 20;
        resto = resto % 20;
        int notas10 = (int) resto / 10;
        resto = resto % 10;
        int notas5 = (int) resto / 5;
        resto = resto % 5;
        int notas2 = (int) resto / 2;
        resto = resto % 2;
        int moeda100 = (int) resto / 1;
        resto = resto % 1;

        resto = resto * 100;

        int moeda50 = (int) resto / 50;
        resto = resto % 50;
        int moeda25 = (int) resto / 25;
        resto = resto % 25;
        int moeda10 = (int) resto / 10;
        resto = resto % 10;
        int moeda5 = (int) resto / 5;
        resto = resto % 5;
        int moeda1 = (int) resto / 1;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        System.out.println(moeda100 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(moeda1 + " moeda(s) de R$ 0.01");
    
        scan.close();
    }

	
}