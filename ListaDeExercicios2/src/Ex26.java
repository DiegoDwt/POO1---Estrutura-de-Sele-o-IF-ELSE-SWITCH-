import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double n = entrada.nextDouble();
		if (Math.floor(n) != n) {
			System.out.println("É decimal!");
		} else {
			System.out.println("É inteiro!");
		}
		entrada.close();
	}

}



