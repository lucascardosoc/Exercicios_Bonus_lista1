import java.util.Scanner;
public class Exerc�cio001 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int idade;
		int ano;
		int subtracao;
		
		System.out.println("Por favor, digite o ano atual!");
		idade = leitor.nextInt();
		
		System.out.println("Por favor, digite seu ano de nascimento!");
		ano = leitor.nextInt();
		
		subtracao = idade - ano;
		
		System.out.println("Sua idade � " + subtracao);
		
		leitor.close();
		
		
	}

}
