import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double desconto = 0;
		double gasolina = 2.5;
		double alcool = 1.9;
		double preco = 0;
		double precoDescontado = 0;
		System.out.print("Quantidade de litros da venda: ");
		float litros = entrada.nextFloat();
		System.out.print("Informe o tipo de combustível (G-Gasolina e A-Álcool): ");
		String tipo = entrada.next();
		if ("a".equals(tipo) || "A".equals(tipo)){
			if(litros<=20) {
				desconto = 0.03;
				preco = alcool * litros;
			} else if (litros>20) {
				desconto = 0.05;
				preco = alcool * litros;
			}
		} else if ("g".equals(tipo) || "G".equals(tipo)) {
			if(litros<=20) {
				desconto = 0.04;
				preco = gasolina * litros;
			} else if (litros>20) {
				desconto = 0.06;
				preco = gasolina * litros;
			}			
		} else {
			System.out.println("Entrada inválida!");
		}
		precoDescontado = preco - (preco * desconto);
		System.out.println("Preço: R$" + preco);
		System.out.println("Desconto: R$" + (preco*desconto));
		System.out.println("Valor a ser pago: R$" + precoDescontado);
		
		entrada.close();
	}

}
