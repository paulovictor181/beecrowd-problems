import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        
        if(B > C && D > A){

            if(C + D > A + B){

                if(C > 0 && D > 0){

                    if(A % 2 == 0){

                        System.out.println("Valores aceitos");

                    }else{

                        System.out.println("Valores nao aceitos");
                    }
                }else{

                    System.out.println("Valores nao aceitos");
                }
            }else{

                System.out.println("Valores nao aceitos");
            }
    
        }else{
            
            System.out.println("Valores nao aceitos");
        }
    
        scan.close();
    }

	
}