import java.util.Scanner;
public class Exercício004 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int distancia;
		System.out.println("ROBÔ DE COMBATE");
		System.out.println("Qual a distância do inimigo?");
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
