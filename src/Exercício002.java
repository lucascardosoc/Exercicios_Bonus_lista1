import java.util.Scanner;
public class Exercício002 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int tempo;
		int minutos = 60;
		int segundos = 3600;
		int divisao;
		int multiplicacao;
		
		System.out.println("Quantos minutos esse filme tem?");
		tempo = leitor.nextInt();
		
		divisao = tempo / minutos;
		multiplicacao = tempo * segundos;
		
		System.out.println("Esse filme possui, " + divisao + "horas");
		System.out.println("E " + multiplicacao + "segundos");
		leitor.close();
		

	}

}
