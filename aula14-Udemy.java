import java.util.Scanner; // importando biblioteca do Scanner

public class aula14 { // Entrada de dados: Ler um só CARACTERE
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            char x;
            x = sc.next().charAt(0);          // para ler valor char inclui o CharAt(0); 
            System.out.println("Você digitou: " + x);
            // para encerrar o comando sc
        }
    }
}