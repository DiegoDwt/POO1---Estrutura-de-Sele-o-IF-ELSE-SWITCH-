import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("FORMAÇÃO DE TRIÂNGULOS");
		System.out.println("Informe a medida do primeiro lado: ");
		float l1 = entrada.nextFloat();
		System.out.println("Informe a medida do segundo lado: ");
		float l2 = entrada.nextFloat();
		System.out.println("Informe a medida do terceiro lado: ");
		float l3 = entrada.nextFloat();
		boolean triangulo;
		if ((l1<l2+l3) && (l2<l1+l3) && (l3<l2+l1)) {
			triangulo = true;
		} else {
			triangulo = false;
		}
		String tipo = "";
		if ((triangulo) && (l1==l2) && (l2==l3) && (l1==l3)) {
			tipo = "Equilátero";
		} else if ((triangulo) && (l1!=l2) && (l2!=l3) && (l1!=l3)) {
			tipo = "Escaleno";
		} else {
			tipo = "Isósceles";
		}
		String resposta;
        if (triangulo) {
        	resposta = "Forma um triângulo";
        } else {
        	resposta = "Não forma um triângulo!";
        }
        System.out.println(resposta);
        if (triangulo) {
        	System.out.println("Do tipo " + tipo);
        }
        entrada.close();
	}

}
