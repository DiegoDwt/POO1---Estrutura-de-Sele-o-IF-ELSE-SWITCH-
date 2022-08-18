import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Função de Segundo Grau");
		System.out.println("No formato AX\u00B2 + BX + C");
		System.out.print("Informe o valor de A: ");
		float letraA = entrada.nextFloat();
		float letraB = 0;
		float letraC = 0;
		double delta = 1;
	    boolean encerra = false;
	    double x1 = 1000;
        double x2 = 1000;
        double raizDelta = 0;
	    while (!encerra){
			if (letraA==0) {
				System.out.println("Não é Equação de Segundo Grau!");
				encerra = true;				
			} else {
				System.out.print("Informe o valor de B: ");
				letraB = entrada.nextFloat();
				System.out.print("Informe o valor de C: ");
				letraC = entrada.nextFloat();
				delta = (Math.pow(letraB, 2) - (4 * letraA * letraC));
				raizDelta = Math.sqrt(delta);
				if (delta<0) {
					encerra = true;
					System.out.println("Delta = " + delta);
					System.out.println("A equação não possui raízes reais!");
				} else {
					encerra = true;
					x1 = ((-letraB + raizDelta)/2 * letraA);
					x2 = ((-letraB - raizDelta)/2 * letraA);
					if (delta==0) {
						encerra = true;
						System.out.println("Delta = " + delta);
						System.out.println("A equação possui apenas uma raiz real");
						System.out.println("X = " + x1);
					} else {
						encerra = true;
						System.out.println("Delta = " + delta);
						System.out.println("A equação possui duas raízes reais");
						System.out.println("X1=" + x1 + " e " + "X2=" + x2);
					}
				}
			}
	    }
        entrada.close();
	}
}
