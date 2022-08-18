import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a média do aluno: ");
		float media = entrada.nextFloat();
		String resposta = "";
		if ((media<3) && (media>0)) {
			resposta = "Reprovado";
		} else if ((media>=3) && (media<=6.9)) {
			resposta = "Em exame";
		} else if ((media>=7) && (media <=10)) {
			resposta = "Aprovado";
		} else if ((media<0) || (media>10)) {
			resposta = "Entrada inválida";
		}
		System.out.println(resposta);
		entrada.close();

	}

}
