
import java.util.Scanner;
        
public class ex07 { // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um número: ");
        numero = sc.nextInt();
        
        if (numero < 0){
            System.out.println("Negativo");
        }
        else{
            System.out.println("Poisitivo");
        }

        sc.close();
    }
}