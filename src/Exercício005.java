import java.util.Scanner;
public class Exercício005 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int trash1, trash2, trash3;
		
		System.out.println("Por favor, digite o peso do 1º saco de lixo");
		 trash1 = leitor.nextInt();
		 
		 System.out.println("Por favor, digite o peso do 2º saco de lixo");
		 trash2 = leitor.nextInt();
		 
		 System.out.println("Por favor, digite o peso do 3º saco de lixo");
		 trash3 = leitor.nextInt();
		 
		 if (trash1<trash2) {
			 System.out.println("O drone pode carregar o 1º saco de lixo");
		 }else {
			 if (trash2<trash3) {
				 System.out.println("O drone pode carregar o 2º saco de lixo");
			 }else {
				 if (trash3<trash1) {
					 System.out.println("O drone pode carregar o 3º saco de lixo");
					 
					 leitor.close();
				 }
			 }
		 }
		 
		 

	}

}
