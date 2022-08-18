import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean finaliza = false;	
	    double precoFile = 0;
		double precoAlcatra = 0;
		double precoPicanha = 0;
		int formaPagamento = 0;
		int tipo = 0;
		double valorTotal = 0;
		double desconto = 0;
		double precoFinal = 0;
		boolean tipoValido = false;		
		while (!tipoValido) {
			System.out.println("Qual o tipo de carne da venda: ");
			System.out.println("1-Fil� duplo");
			System.out.println("2-Alcatra");
			System.out.println("3-Picanha");
			tipo = entrada.nextInt();
			if ((tipo==1) || (tipo==2) || (tipo==3)) {
				tipoValido = true;
			}
		}
		System.out.print("Qual a quantidade (Kg)? ");
		float qtd = entrada.nextFloat();
		if (qtd<=5) {
			precoFile = 4.9;
			precoAlcatra = 5.9;
			precoPicanha = 6.9;
		} else if (qtd>5) {
			precoFile = 5.8;
			precoAlcatra = 6.8;
			precoPicanha = 7.8;			
		}
		if (tipo==1) {
			valorTotal = qtd * precoFile;
		} else if (tipo==2) {
			valorTotal = qtd * precoAlcatra;
		} else if (tipo==3) {
			valorTotal = qtd * precoPicanha;
		} else {
			System.out.println("Entrada Inv�lida");
			finaliza = true;
		}
		while (!finaliza) {
			System.out.println("Qual a forma de pagamento? ");
			System.out.println("1-Cart�o Tabajara");
			System.out.println("2-Outra forma");
			formaPagamento = entrada.nextInt();
			if (formaPagamento==1) {
				desconto = 0.05;
				finaliza = true;
			} else if (formaPagamento==2) {
				finaliza = true;
			} else if ((formaPagamento!=1) && (formaPagamento!=2)) {
				System.out.println("Entrada inv�lida!");
				finaliza = true;
			}
		}
		precoFinal = (valorTotal - (valorTotal * desconto));
		System.out.println("*****CUPOM FISCAL******");
		if (tipo==1) {
			System.out.println("Tipo: Fil� duplo");
		} else if (tipo==2) {
			System.out.println("Tipo: Alcatra");
		} else {
			System.out.println("Tipo: Picanha");
		}
		System.out.println("Quantidade: " + qtd + "Kg");
		System.out.println("Desconto: " + Math.round(desconto*100) + "%");
		System.out.println("Valor total: R$" + String.format("%.2f",precoFinal));
		System.out.println("************************");
	    
	    entrada.close();

	}
}
