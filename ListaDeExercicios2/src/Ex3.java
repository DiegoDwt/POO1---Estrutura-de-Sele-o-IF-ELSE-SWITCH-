import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite M para masculino e F para feminino: ");
		String sexo = entrada.next();
		if (sexo.equals("M")) {
			 System.out.println("M - Masculino");
		} else if (sexo.equals("F")) {
			 System.out.println("F - Feminino");
		}
				
		entrada.close();
		
	}

}
