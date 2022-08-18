import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String G1 = "A";
		String G2 = "A";
		String G3 = "B";
		String G4 = "B";
		String G5 = "C";
		String G6 = "C";
		String G7 = "D";
		String G8 = "D";
		String G9 = "E";
		String G10 = "E";
		String R1 = "";
	    String R2 = "";
	    String R3 = "";
	    String R4 = "";
	    String R5 = "";
	    String R6 = "";
	    String R7 = "";
	    String R8 = "";
	    String R9 = "";
	    String R10 = "";
	    int pontos = 0;
	    System.out.print("Informe a resposta da questão 1: ");
	    R1 = entrada.next();
	    System.out.print("Informe a resposta da questão 2: ");
		R2 = entrada.next();
	    System.out.print("Informe a resposta da questão 3: ");
		R3 = entrada.next();
	    System.out.print("Informe a resposta da questão 4: ");
		R4 = entrada.next();
	    System.out.print("Informe a resposta da questão 5: ");
		R5 = entrada.next();
	    System.out.print("Informe a resposta da questão 6: ");
		R6 = entrada.next();
	    System.out.print("Informe a resposta da questão 7: ");
		R7 = entrada.next();
	    System.out.print("Informe a resposta da questão 8: ");
		R8 = entrada.next();
	    System.out.print("Informe a resposta da questão 9: ");
		R9 = entrada.next();
	    System.out.println("Informe a resposta da questão 10: ");
		R10 = entrada.next();
		System.out.println("******RESPOSTAS******");
        if (R1.equals(G1)) {
        	System.out.println("Q1: " + R1 + ": Correto");
        	pontos++;
        } else {
        	System.out.println("Q1: " + R1 + ": Errado, resposta correta " + G1);
        }
        if (R2.equals(G2)) {
        	System.out.println("Q2: " + R2 + ": Correto");
        	pontos++;
        } else {
        	System.out.println("Q2: " + R2 + ": Errado, resposta correta " + G2);
        }
        if (R3.equals(G3)) {
        	System.out.println("Q3: " + R3 + ": Correto");
        	pontos++;
        } else {
        	System.out.println("Q3: " + R3 + ": Errado, resposta correta " + G3);
        }
        if (R4.equals(G4)) {
        	System.out.println("Q4: " + R4 + ": Correto");
        	pontos++;
        } else {
        	System.out.println("Q4: " + R4 + ": Errado, resposta correta " + G4);
        }
        if (R5.equals(G5)) {
        	System.out.println("Q5: " + R5 + ": Correto");
        	pontos++;
        } else {
        	System.out.println("Q5: " + R5 + ": Errado, resposta correta " + G5);
        }
        if (R6.equals(G6)) {
        	System.out.println("Q6: " + R6 + ": Correto");
        	pontos++;
        } else {
        	System.out.println("Q6: " + R6 + ": Errado, resposta correta " + G6);
        }
        if (R7.equals(G7)) {
        	System.out.println("Q7: " + R7 + ": Correto");
        	pontos++;
        } else {
        	System.out.println("Q7: " + R7 + ": Errado, resposta correta " + G7);
        }
        if (R8.equals(G8)) {
        	System.out.println("Q8: " + R8 + ": Correto");
        	pontos++;
        } else {
        	System.out.println("Q8: " + R8 + ": Errado, resposta correta " + G8);
        }
        if (R9.equals(G9)) {
        	System.out.println("Q9: " + R9 + ": Correto");
        	pontos++;
        } else {
        	System.out.println("Q9: " + R9 + ": Errado, resposta correta " + G9);
        }
        if (R1.equals(G10)) {
        	System.out.println("Q10: " + R10 + ": Correto");
        	pontos++;
        } else {
        	System.out.println("Q10: " + R10 + ": Errado, resposta correta " + G10);
        }
        System.out.println("Pontuação final: " + pontos);
        
        entrada.close();
	}

}
