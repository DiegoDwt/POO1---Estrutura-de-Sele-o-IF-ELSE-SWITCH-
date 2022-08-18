import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Média de 3 notas");
		System.out.print("Digite a primeira nota: ");
		float n1 = entrada.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float n2 = entrada.nextFloat();
		System.out.print("Digite a tereira nota: ");
		float n3 = entrada.nextFloat();
		float media = ((n1 + n2 + n3) / 3);
		if ((media>=7) && (media<10)) {
			System.out.println("Média: " + media + " Aprovado!");
		} else if (media<7) {
			System.out.println("Média: " + media + " Reprovado!");
		} else if (media==10) {
			System.out.println("Média: " + media + " Aprovado com distinção!");
		} else {
			System.out.println("Média:  " + media + " 1" + " Você digitou incorretamente alguma nota!");
		}
		entrada.close();
	}

}
