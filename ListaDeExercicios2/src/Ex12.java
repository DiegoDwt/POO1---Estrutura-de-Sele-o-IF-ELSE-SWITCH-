import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Salário? ");
		float salario = entrada.nextFloat();
		double aumento = 0;
		if (salario<=280) {
			aumento = 0.2;
		} else if ((salario>280) && (salario<=700)) {
			aumento = 0.15;
		} else if ((salario>700) && (salario<=1500)) {
			aumento = 0.1;
		} else {
			aumento = 0.05;
		}
		double valorDoAumento = salario * aumento;
		double salarioFinal = salario + valorDoAumento;
		double percentual = aumento * 100;
		System.out.println("Salário antes do reajuste: R$" + salario);
		System.out.println("Percentual de aumento: " + percentual + "%");
		System.out.println("Valor do aumento: R$" + valorDoAumento);
		System.out.println("Novo salário: R$" + salarioFinal);

		entrada.close();
		
	}

}
