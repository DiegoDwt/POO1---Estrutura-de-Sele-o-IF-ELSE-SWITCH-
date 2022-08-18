import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		float n1 = entrada.nextFloat();
		System.out.println("Digite outro número: ");
		float n2 = entrada.nextFloat();
		System.out.println("Digite outro número: ");
		float n3 = entrada.nextFloat();
		float maior;
		float menor;
		if ((n1>n2) && (n1>n3)) {
			maior = n1;
		} else if ((n2>n1) && (n2>n3)) {
			maior = n2;
		} else {
			maior = n3;
		}
		if ((n1<n2) && (n1<n3)) {
			menor = n1; 
		} else if ((n2<n1) && (n2<n3)) {
			menor = n2;
		} else {
			menor = n3;
		}
		System.out.println("Maior: " + maior + " e " + "Menor: " + menor);
		entrada.close();
	}

}
