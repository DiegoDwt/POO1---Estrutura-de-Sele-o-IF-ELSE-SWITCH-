import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		String resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int num = entrada.nextInt();
		if (num % 2 == 0) {
	          resultado = "� par!";
	    } else {
              resultado = "� impar!";
        }
		int novoNum = num + 1;
		System.out.println(resultado);
		System.out.println("O novo n�mero �: " + novoNum);
		entrada.close();
    }
}