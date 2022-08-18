import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Média de idade de três alunos");
		System.out.print("Digite a idade do 1º aluno: ");
		int id1 = entrada.nextInt();
		System.out.print("Digite a idade do 2º aluno: ");
		int id2 = entrada.nextInt();
		System.out.print("Digite a idade do 3º aluno: ");
		int id3 = entrada.nextInt();
		float media = ((id1 + id2 + id3) / 3);
		if (media<=25) {
			System.out.println("Média de idade da turma: " + media + " anos");
			System.out.println("Turma jovem");
		} else if ((media>25) && (media<=40)) {
			System.out.println("Média de idade da turma: " + media + " anos");
			System.out.println("Turma adulta");
		} else {
			System.out.println("Média de idade da turma: " + media + " anos");
			System.out.println("Turma idosa");
		}
		entrada.close();
	}

}
