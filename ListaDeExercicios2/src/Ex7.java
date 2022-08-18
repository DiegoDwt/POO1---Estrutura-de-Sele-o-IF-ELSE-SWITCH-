import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int n1 = entrada.nextInt();
		System.out.println("Digite outro número inteiro: ");
		int n2 = entrada.nextInt();
		System.out.println("Digite outro número inteiro: ");
		int n3 = entrada.nextInt();
		int primeiro = 0;
		int segundo = 0;
		int terceiro = 0;
		if ((n1>n2) && (n1>n3)){
            primeiro = n1;
	    } else if ((n2>n1) && (n2>n3)) {
            primeiro = n2;
        } else if ((n3>n1) && (n3>n2)) {
        	primeiro = n3;
        }
        if (((n1>n2) && (n1<n3)) || ((n1>n3) && (n1<n2))){
        	segundo = n1;
        } else if (((n2>n1) && (n2<n3)) || ((n2>n3) && (n2<n1))){
            segundo = n2;
        } else if (((n3>n1) && (n3<n2)) || ((n3>n2) && (n3<n1))){
        	segundo = n3;
        } 
        if ((n1<n2) && (n1<n3)) {
           terceiro = n1;
        } else if ((n2<n1) && (n2<n3)) {
        	terceiro = n2;
        } else if ((n3<n1) && (n3<n2)) {
        	terceiro = n3;
        }
		System.out.println("Os números em ordem decrescente: " + primeiro + "," + segundo + "," + terceiro);
		entrada.close();
		
    }
}