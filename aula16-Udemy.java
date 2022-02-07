import java.util.Scanner; // importando biblioteca do Scanner

public class aula16 { // Entrada de dados: Ler um texto ATE A QUEBRA DE LINHA
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            String s1, s2, s3;
            s1 = sc.nextLine();  // next line é para ler a linha inteira
            s2 = sc.nextLine();
            s3 = sc.nextLine();
            System.out.println("Dados digitados: ");
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            // para encerrar o comando sc
        }
    }
}
