import java.util.Scanner;

public class Exerc�cio003 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int varA;
		int varB;
		
		System.out.println("Por favor, digite um n�mero para A");
		varA = leitor.nextInt();
		System.out.println("Por favor, digite outro n�mero para B");
		varB = leitor.nextInt();
		
		varA = varA + varB;
		varB = varA - varB;
		varA = varA - varB;
		
		System.out.println("O n�mero de A �: " + varA);
		System.out.println("E o n�mero de B �: " + varB);
		leitor.close();
		
	}

}
