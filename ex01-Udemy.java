import java.util.Scanner;

public class ex01{
    
    /* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com 
    uma mensagem explicativa.
    */
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int A, B, soma;
            A = sc.nextInt();
            B = sc.nextInt();
            soma = A + B;
            System.out.println("SOMA = " + soma);
        }
    }


}