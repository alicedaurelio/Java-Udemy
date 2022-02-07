import java.util.Scanner; // importando biblioteca do Scanner

public class aula12 { // Entrada de dados: Ler um numero INTEIRO
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int x;
            x = sc.nextInt();          // para ler valor inteiro inclui no next o INT, ficando NextINT
            System.out.println("Você digitou: " + x);
            // para encerrar o comando sc
        }
    }
}

