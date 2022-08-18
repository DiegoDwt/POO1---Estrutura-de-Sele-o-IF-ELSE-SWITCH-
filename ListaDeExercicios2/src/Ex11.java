import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Em que turno você estuda? M-Matutino, V-Vespertino ou N-Noturno");
		String turno = entrada.next();
		String mensagem = "";
		if (("m".equals(turno)) || ("M".equals(turno))) {
			mensagem = "Bom dia!";
		} else if (("v".equals(turno)) || ("V".equals(turno))) {
			mensagem = "Boa tarde!";
		} else if (("n".equals(turno)) || ("N".equals(turno))) {
			mensagem = "Boa noite";
		}
		System.out.println(mensagem);
		entrada.close();
			
	}

}
