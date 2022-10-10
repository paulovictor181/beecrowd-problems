import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int segundos = scan.nextInt();
        int resto;

        int horas = (int) segundos / 3600;  
        resto = segundos % 3600;
        int minutos = (int) resto / 60;
        resto = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + resto );

    
        scan.close();
    }

	
}