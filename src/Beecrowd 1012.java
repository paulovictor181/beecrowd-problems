import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double pi = 3.14159;

        double triangulo = (A * C) / 2;
        double circulo = pi * Math.pow(C, 2.0);
        double trapezio = ((A+B)*C)/2;
        double quadrado = B*B;
        double retangulo = A*B;

        System.out.printf("TRIANGULO: %.3f\n" , triangulo );
        System.out.printf("CIRCULO: %.3f\n" , circulo );
        System.out.printf("TRAPEZIO: %.3f\n" , trapezio );
        System.out.printf("QUADRADO: %.3f\n" , quadrado );
        System.out.printf("RETANGULO: %.3f\n" , retangulo );
        

        scan.close();
    }
}