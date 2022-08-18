import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int k = 0;
		System.out.println("Responda as perguntas com s-sim ou n-não");
		System.out.println("Telefonou para vítima? ");
		String q1 = entrada.next();
		if (("s".equals(q1)) || ("S".equals(q1))) {
			k++;
		}
		System.out.println("Esteve no local do crime? ");
		String  q2 = entrada.next();
		if (("s".equals(q2)) || ("S".equals(q2))) {
			k++;
		}
		System.out.println("Mora perto da vítima? ");
		String  q3 = entrada.next();
		if (("s".equals(q3)) || ("S".equals(q3))) {
			k++;
		}
		System.out.println("Devia para a vítima? ");
		String  q4 = entrada.next();
		if (("s".equals(q4)) || ("S".equals(q4))) {
			k++;
		}
		System.out.println("Já trabalhou com a vítima? ");
		String  q5 = entrada.next();
		if (("s".equals(q5)) || ("S".equals(q5))) {
			k++;
		}
		if (k==2) {
			System.out.println("Classificação: Suspeito(a)");
		} else if ((k==3) || (k==4)) {
			System.out.println("Classificação: Cúmplice");
		} else if (k==5){
			System.out.println("Assassino(a)");
		} else {
			System.out.println("Inocente");
		}
		entrada.close();
	}

}
