import java.util.Scanner;
public class Exercício005 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner (System.in);
		int trash;
		
		System.out.println("Por favor, digite o peso do 1º saco de lixo");
		 trash = leitor.nextInt();
		 
		 System.out.println("Por favor, digite o peso do 2º saco de lixo");
		 trash = leitor.nextInt();
		 
		 System.out.println("Por favor, digite o peso do 3º saco de lixo");
		 trash = leitor.nextInt();
		 
		 if (trash<10) {
			 System.out.println("O drone pode carregar o " + trash);
		 }else {
		 if (trash>10) 
			 System.out.println("O drone não pode carregar nenhum dos lixos");
		 }
		 
		 leitor.close();

	}

}
