import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um ano com 4 digitos: ");
		int ano = entrada.nextInt();
		if (ano % 4 == 0) {
			System.out.println("� bissexto!");
		} else {
			System.out.println("N�o � bissexto!");
		}
		entrada.close();
	}

}
