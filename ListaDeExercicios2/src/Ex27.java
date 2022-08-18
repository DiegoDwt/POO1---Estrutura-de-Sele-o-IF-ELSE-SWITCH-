import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double resultado = 0;
		System.out.println("OPERAÇÕES COM DOIS NÚMEROS");
		System.out.print("Digite o primeiro número: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o segundo número: ");
		double n2 = entrada.nextDouble();
		System.out.println("Informe qual operação deseja realizar:");
		System.out.println("1-Adição(+)");
		System.out.println("2-Subtração(-)");
		System.out.println("3-Divisão(/)");
		System.out.println("4-Multiplicação(*)");
		int operacao = entrada.nextInt();
		if ((operacao<1) || (operacao>4)) {
			System.out.println("Entrada inválida!");
		} else {
			if (operacao==1) {
				resultado = n1 + n2;	
				System.out.println(n1 + " + " + n2 + " = " + resultado);
			} else if (operacao==2) {
				resultado = n1 - n2;
				System.out.println(n1 + " - " + n2 + " = " + resultado);
			} else if (operacao==3) {
				resultado = n1 / n2;
				System.out.println(n1 + " / " + n2 + " = " +resultado);
			} else if (operacao==4) {
				resultado = n1 * n2;
				System.out.println(n1 + " * " + n2 + " = " + resultado);
			}
			if (resultado % 2 == 0 ) {
				System.out.println("É par");
			} else {
				System.out.println("É impar");
			}
			if (resultado>0) {
				System.out.println("É positivo");
			} else if (resultado<0) {
				System.out.println("É negativo");
			}
			if (Math.floor(resultado)!=resultado) {
				System.out.println("É decimal");
			} else {
				System.out.println("É inteiro");
			}
			entrada.close();			
		}

	}

}
