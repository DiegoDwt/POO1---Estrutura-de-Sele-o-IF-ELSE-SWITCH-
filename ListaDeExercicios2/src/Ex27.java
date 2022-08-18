import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double resultado = 0;
		System.out.println("OPERA��ES COM DOIS N�MEROS");
		System.out.print("Digite o primeiro n�mero: ");
		double n1 = entrada.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		double n2 = entrada.nextDouble();
		System.out.println("Informe qual opera��o deseja realizar:");
		System.out.println("1-Adi��o(+)");
		System.out.println("2-Subtra��o(-)");
		System.out.println("3-Divis�o(/)");
		System.out.println("4-Multiplica��o(*)");
		int operacao = entrada.nextInt();
		if ((operacao<1) || (operacao>4)) {
			System.out.println("Entrada inv�lida!");
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
				System.out.println("� par");
			} else {
				System.out.println("� impar");
			}
			if (resultado>0) {
				System.out.println("� positivo");
			} else if (resultado<0) {
				System.out.println("� negativo");
			}
			if (Math.floor(resultado)!=resultado) {
				System.out.println("� decimal");
			} else {
				System.out.println("� inteiro");
			}
			entrada.close();			
		}

	}

}
