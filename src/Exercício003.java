import java.util.Scanner;

public class Exercício003 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int varA;
		int varB;
		
		System.out.println("Por favor, digite um número para A");
		varA = leitor.nextInt();
		System.out.println("Por favor, digite outro número para B");
		varB = leitor.nextInt();
		
		varA = varA + varB;
		varB = varA - varB;
		varA = varA - varB;
		
		System.out.println("O número de A é: " + varA);
		System.out.println("E o número de B é: " + varB);
		leitor.close();
		
	}

}
