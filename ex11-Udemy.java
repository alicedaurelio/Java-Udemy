import java.util.Scanner;

public class ex11 {
    
    /* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 
    A  seguir, calcule e mostre o valor da conta a pagar:
    
    Codigo              Especificação           Preço
    1                   Cachorro quente         7.00
    2                   X-salada                8.00
    3                   X-bacon                 9.00
    4                   Torrada simples         4.00
    5                   Refrigerante            5.50
    
    */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;
		double total;
                
                System.out.println("Digite o codigo para escolher seu lanche: ");
                
                codigo = sc.nextInt();
		quantidade = sc.nextInt();
                
		if (codigo == 1) {
			total = quantidade + 7.0;
		}
		else if (codigo == 2) {
			total = quantidade + 8.0;
		}
		else if (codigo == 3) {
			total = quantidade + 9.0;
		}
		else if (codigo == 4) {
			total = quantidade + 4.0;
		}
		else {
			total = quantidade + 5.50;
		}

		System.out.printf("Preço do seu pedido: R$ %.2f%n", total);
		
		sc.close();
	}
}
