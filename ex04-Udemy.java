import java.util.Scanner;

public class ex04 {

	/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que 
	recebe por hora e calcula o salário desse funcionário. 
	A seguir, mostre o número e o salário do funcionário, com duas casas decimais
	*/

	public static void main(String[] args) {

		
            try (Scanner sc = new Scanner(System.in)) {
                int numero, horas;
                double valorHora, salario;
                numero = sc.nextInt();
                horas = sc.nextInt();
                valorHora = sc.nextDouble();
                salario = valorHora * horas;
                System.out.println("\nNumero = " + numero);
                System.out.printf("SALARY = U$ %.2f%n", salario);
            }
	}
}
