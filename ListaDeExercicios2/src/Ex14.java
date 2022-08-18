import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 100;
		String dia;
		while (num != 0) {
			System.out.print("Digite um número correspondente a um dia da semana: ");
			num = entrada.nextInt();
			if (num==1){
				dia = "Domingo";
				System.out.println(dia);
			} else if (num==2){
				dia = "Segunda";
				System.out.println(dia);
			} else if (num==3){
			    dia = "Terça";
			    System.out.println(dia);
			} else if (num==4){
				dia = "Quarta";
				System.out.println(dia);
			} else if (num==5){
				dia = "Quinta";
				System.out.println(dia);
			} else if (num==6){
				dia = "Sexta";
				System.out.println(dia);
			} else if (num==7){
				dia = "Sábado";
				System.out.println(dia);
			} else if (num==0){
				System.out.println("Fim");
			} else {
				System.out.println("Entrada inválida");
			}
		}
		entrada.close();
		
	}

}
