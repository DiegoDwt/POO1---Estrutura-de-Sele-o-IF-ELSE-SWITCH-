import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		float n1 = entrada.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float n2 = entrada.nextFloat();
		float media = ((n1+n2)/2);
		String resultado;
		if (media>=7) {
            resultado = "Aprovado";
		} else {
			resultado = "Reprovado";
		}
		System.out.println("A média é: " + media);
		System.out.println(resultado);
		entrada.close();
	}

}
