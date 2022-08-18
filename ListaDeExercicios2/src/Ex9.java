import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a sua altura (em metros)? ");
		float alt = entrada.nextFloat();
		System.out.println("Qual o seu peso (em Kg)? ");
		float peso = entrada.nextFloat();
	    System.out.println("Informe o sexo: M-Masculino e F-Feminino ");
	    String sexo = entrada.next();
	    double pesoIdeal = 0;
	    if (("m".equals(sexo)) || ("M".equals(sexo))){
	    	pesoIdeal = ((72.7 * alt) - 58);
	    } else if (("f".equals(sexo)) || ("F".equals(sexo))) {
	    	pesoIdeal = ((62.1 * alt) - 44.7);
	    }
	    String mensagem = "";
	    if (peso==pesoIdeal) {
	    	mensagem = "Você está no peso ideal!";
	    } else if (peso>pesoIdeal) {
	    	mensagem = "Você está acima do peso!";
	    } else if (peso<pesoIdeal) {
	    	mensagem = "Você está abaixo do peso!";
	    }
	    System.out.println("Altura: " + alt + "," + " Peso: " + peso + " e " + "Sexo: " + sexo);
	    System.out.println("Peso ideal: " + pesoIdeal);
	    System.out.println(mensagem);
	    entrada.close();
 
	}

}
