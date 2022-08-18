import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o ano com 4 dígitos: ");
		int ano = entrada.nextInt();
		if (ano % 4 == 0) {
			System.out.println("É Bissexto");
		} else {
			System.out.println("Não é Bissexto");
		}
		entrada.close();
	}

}
