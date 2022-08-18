import java.util.Scanner;
public class Ex22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número inteiro menor que 1000: ");
		int num = entrada.nextInt();
		int centena = 0;
		int dezena = 0;
		int unidade = 0;
		if (num<1000) {
			unidade = num % 10;
			dezena = (((num % 100) - unidade)/10);
			centena = num / 100;
			System.out.println("Centena: " + centena);
			System.out.println("Dezena: " + dezena);
			System.out.println("Unidade: " + unidade);		
		} else {
			System.out.println("Entrada inválida!");
		}
		entrada.close();
	}

}
