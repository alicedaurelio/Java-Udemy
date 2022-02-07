import java.util.Scanner; // importando biblioteca do Scanner

public class aula15 { // Entrada de dados: Ler vários dados na mesma linha, separados por espaços
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            String x;
            int y;
            double z;
            x = sc.next();
            y = sc.nextInt();
            z = sc.nextDouble();
            System.out.println("\nDados digitados: \n");
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            // para encerrar o comando sc
        }
    }
}
