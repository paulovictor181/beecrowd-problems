import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dias = scan.nextInt();
        int resto;

        int ano = (int) dias / 365;  
        resto = dias % 365;
        int mes = (int) resto / 30;
        resto = resto % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(resto + " dia(s)");

    
        scan.close();
    }

	
}