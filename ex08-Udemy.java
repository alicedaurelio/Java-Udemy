import java.util.Scanner;

public class ex08 { // Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	int Num;
	
        System.out.println("Digite um numero: ");
        Num = sc.nextInt();
        
	if (Num % 2 == 0) {
            System.out.println("PAR");
	}
	else {
            System.out.println("IMPAR");
	}

		sc.close();
	}
}