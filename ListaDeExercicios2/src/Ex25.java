import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int num = entrada.nextInt();
		if (num % 2 == 0) {
			System.out.println("É par!");
		} else {
			System.out.println("É impar!");			
		}
		entrada.close();
		
	}

}
