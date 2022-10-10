import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int hours = scan.nextInt();
        double moneyPerHours = scan.nextDouble();

        double SALARY = (hours * moneyPerHours);

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n" , SALARY );
        

        scan.close();
    }
}