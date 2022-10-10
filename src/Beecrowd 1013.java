import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        if (A > B && A > C) {
        	System.out.println(A + " eh o maior");
        } else if (B > C) {
        	System.out.println(B + " eh o maior");
        } else {
        	System.out.println(C + " eh o maior");
        }

        scan.close();
    }

}