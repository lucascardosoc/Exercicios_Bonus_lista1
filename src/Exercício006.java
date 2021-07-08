import java.util.Scanner;
public class Exercício006 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Double totalCompra, valorFinal=0.0;
		String cupom;
		//System.out.ptintln("SISTEMA DE DESCONTOS");
		System.out.println("Por favor, digite o valor total da compra");
		totalCompra = leitor.nextDouble();
		System.out.println("Por favor, digite o seu cupom");
		cupom = leitor.next();
		
		if(cupom.equalsIgnoreCase("DIADEFESTA")) {
			valorFinal = totalCompra * 0.97;
		} else {
			valorFinal = totalCompra;
		}
		leitor.close();
		
		System.out.println("O valor final é de R$ " + valorFinal);
		
	}

}
