import java.util.Scanner;
public class Exerc�cio004 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int distancia;
		System.out.println("ROB� DE COMBATE");
		System.out.println("Qual a dist�ncia do inimigo?");
		distancia = leitor.nextInt();
		
		if (distancia>70) {
			System.out.println("DESATIVADO");
		}else {
			if (distancia<=70) 
				System.out.println("ATIVADO");
		}
		
		leitor.close();
	}

}
