import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int codigo = scan.nextInt();
		int qtd = scan.nextInt();
		double total;
		switch (codigo) {
			case 1:	total = qtd * 4.00; break;
			case 2: total = qtd * 4.50; break;
			case 3: total = qtd * 5.00; break;
			case 4: total = qtd * 2.00; break;
			case 5: total = qtd * 1.50; break;
			default: total = 0;
		}
		System.out.printf("Total: R$ %.2f\n", total);
		
		scan.close();
	
	}

	
}