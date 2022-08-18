import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		String resultado = "";
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		int n1 = entrada.nextInt();
		if (n1 > 0) {
			resultado = "É positivo!";
		} else if (n1 < 0){
			resultado = "É negativo!";
		} else {
            resultado = "Zero!";
	    }
		System.out.println(resultado);
		
		entrada.close();

    }

}