import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("1ª nota: ");
		float n1 = entrada.nextFloat();
		System.out.println("2ª nota: ");
		float n2 = entrada.nextFloat();
		float media = ((n1 + n2) / 2);
		String conceito = "";
		String mensagem = "";
		if ((media>=9) && (media<=10)) {
			conceito = "A";
			mensagem = "Aprovado!";
		} else if ((media>=7.5) && (media<9)) {
			conceito = "B";
			mensagem = "Aprovado!";
		} else if ((media>=6) && (media<7.5)) {
			conceito = "C";
			mensagem = "Aprovado!";
		} else if ((media>=4) && (media<6)) {
			conceito = "D";
			mensagem = "Reprovado!";
		} else if ((media>=0) && (media<4)) {
			conceito = "E";
			mensagem = "Reprovado";
		} else if ((media<0) || (media>10)) {
			conceito = "Entrada Inválida!";
		}
        System.out.println("1ª nota: " + n1 + "/ 2ª nota: " + n2);
		System.out.println("Média: " + media + "/ Conceito: " + conceito);
		System.out.println(mensagem);
        entrada.close();
	}

}
