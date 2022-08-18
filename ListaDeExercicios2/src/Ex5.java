import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		String resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite uma letra qualquer: ");
		String letra = entrada.next();
		if ((letra.equals("a")|| letra.equals("A")) || (letra.equals("e") || letra.equals("E")) || (letra.equals("i") || letra.equals("I")) || (letra.equals("o") || letra.equals("O")) || (letra.equals("u") || letra.equals("U"))) {
			resultado = "É vogal!";
		} else {
            resultado = "Não é vogal";
	    }
        System.out.println(resultado);
        entrada.close();
    }

	
}