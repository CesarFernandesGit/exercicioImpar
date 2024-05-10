import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Me diga um número qualquer: ");
		int numero = scanner.nextInt();
		
		int resto = numero % 2;
		if (resto == 1) {
			System.out.printf("O número %d é ÍMPAR ", numero);
		} else if (resto == 0) {
			System.out.printf("O número %d é PAR ", numero);
		}
		
	}

}
