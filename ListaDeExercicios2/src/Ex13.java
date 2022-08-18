import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o valor da hora trabalhada? ");
		float valorHora = entrada.nextFloat();
		System.out.println("Qual a quantidade de horas trabalhadas no mês? ");
		float horas = entrada.nextFloat();
		double bruto = valorHora * horas;
		double taxaIr;
		if (bruto<=900) {
			taxaIr = 0;
		} else if ((bruto>900) && (bruto<1500)) {
			taxaIr = 0.05;
		} else if ((bruto>=1500) && (bruto<2500)) {
			taxaIr = 0.1;
		} else {
			taxaIr = 0.2;
		}
		double ir = bruto * taxaIr;
		double inss = bruto * 0.1;
		double fgts = bruto * 0.11;
		double sindicato = bruto * 0.03;
		double totalDescontos = ir + inss + sindicato;
		double liquido = bruto - totalDescontos;
		System.out.println("Salário Bruto: R$" + bruto);
		System.out.println("(-)IR" + "(" + taxaIr*100 + "%): R$" + ir);
		System.out.println("(-)INSS (10%): R$" + inss);
		System.out.println("FGTS (11%): R$" + fgts);
		System.out.println("Total de descontos: R$" + totalDescontos);
		System.out.println("Salário Líquido: " + liquido );
		
		entrada.close();
	}

}
