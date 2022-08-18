import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int maior = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int n1 = entrada.nextInt();
		System.out.print("Digite outro número inteiro: ");
		int n2 = entrada.nextInt();
		if (n1>n2) {
			maior = n1;
		} else {
			maior  = n2;
		}
		System.out.println(maior + " é o maior.");
        entrada.close();
	}

}
