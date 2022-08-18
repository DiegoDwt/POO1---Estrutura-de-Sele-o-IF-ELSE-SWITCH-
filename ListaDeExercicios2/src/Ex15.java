import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Preço de custo: ");
		float preco = entrada.nextFloat();
		System.out.println("Código de origem: ");
		System.out.println("1-Sul");
		System.out.println("2-Norte");
		System.out.println("3-Leste");
		System.out.println("4-Oeste");
		System.out.println("5 ou 6-Nordeste");
		System.out.println("7 ou 8-Centro-oeste");
		int cod = entrada.nextInt();
		String resposta;
		if (cod==1) {
			resposta = "Sul";
		} else if (cod==2) {
			resposta = "Norte";
		} else if (cod==3) {
			resposta = "Leste";
		} else if (cod==4) {
			resposta = "Oeste";
		} else if ((cod==5)||(cod==6)) {
			resposta = "Nordeste";
		} else if ((cod==7) || (cod==8)) {
			resposta = "Centro-oeste";
		} else {
			resposta = "Importado";
		}
		System.out.println("Preço: R$" + preco + "/ Procedência: " + resposta);
		entrada.close();
	}	
		
}


