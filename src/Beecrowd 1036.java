import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        double delta = Math.pow(B , 2) - (4*A*C);

        if(delta > 0 && A != 0){
            double x1 = (- B + Math.sqrt(delta)) / (2*A);
            double x2 = (- B - Math.sqrt(delta)) / (2*A);

            System.out.printf("R1 = %.5f\n" , x1);
            System.out.printf("R2 = %.5f\n" , x2);

        }else{
            System.out.println("Impossivel calcular");
        }
    
        scan.close();
    }

	
}