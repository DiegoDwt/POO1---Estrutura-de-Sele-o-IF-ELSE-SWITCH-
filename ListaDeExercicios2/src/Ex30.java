import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    double precoMorango = 0;
		double precoMaca = 0;
		double totalMorango = 0;
		double totalMaca = 0;
		double valorTotal = 0;
		double pesoTotal = 0;
		double desconto = 0;
		double precoFinal = 0;
		System.out.print("Quantidade de morangos (Kg): ");
		float pesoMorango = entrada.nextFloat();
		System.out.print("Quantidade de maças (Kg): ");
		double pesoMaca = entrada.nextDouble();
		if (pesoMorango<=5) {
			precoMorango = 2.5;
			totalMorango = pesoMorango * precoMorango;
		} else if (pesoMorango>5) {
			precoMorango = 2.2;
			totalMorango = pesoMorango * precoMorango;
		}
		if (pesoMaca<=5) {
			precoMaca = 1.8;
			totalMaca = pesoMaca * precoMaca;
		} else if (pesoMaca>5) {
		    precoMaca = 1.5;
		    totalMaca = pesoMaca * precoMaca;
	    }
	    valorTotal = totalMorango + totalMaca;
	    pesoTotal = pesoMorango + pesoMaca;
	    if ((pesoTotal>8) || (valorTotal>25)) {
	    	desconto = 0.1;
	    }
	    precoFinal = (valorTotal - (valorTotal * desconto));
	    System.out.println("Valor total: R$" + String.format("%.2f",valorTotal));
	    System.out.println("Desconto: R$" + Math.round(desconto*100) + "%");
	    System.out.println("Preço final: R$ " + String.format("%.2f",precoFinal));
	    
	    entrada.close();
    }
}

