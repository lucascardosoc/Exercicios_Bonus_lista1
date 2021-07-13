import java.util.Scanner;

public class Exercício005 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int trash1, trash2, trash3;

		System.out.println("Por favor, digite o peso do 1º saco de lixo");
		trash1 = leitor.nextInt();

		System.out.println("Por favor, digite o peso do 2º saco de lixo");
		trash2 = leitor.nextInt();

		System.out.println("Por favor, digite o peso do 3º saco de lixo");
		trash3 = leitor.nextInt();

		if (trash1 < trash2 && trash1 < trash3) {
			System.out.println("O lixo 1 é o mais leve, portanto o dorne vai levá-lo");
		}
		if (trash2 < trash1 && trash2 < trash3) {
			System.out.println("O lixo 2 é o mais leve, portanto o drone vai levá-lo");
		}
		if (trash3 < trash1 && trash3 < trash2) {
			System.out.println("O lixo 3 é o mais leve, portanto o drove vai levá-lo");
		}

		leitor.close();
	}
}
