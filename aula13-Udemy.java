import java.util.Scanner; // importando biblioteca do Scanner

public class aula13 { // Entrada de dados: Ler um numero DOUBLE
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            double x;
            x = sc.nextDouble();          // para ler valor double inclui no next o DOUBLE, ficando NextDOUBLE
            System.out.printf("Você digitou: %.2f%n", x); // %.2f é para mostrar casas decimais. %n é para quebrar linha
            // para encerrar o comando sc
        }
    }
}