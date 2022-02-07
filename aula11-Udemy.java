import java.util.Scanner;    // biblioteca do Scanner

public class aula11 { // Entrada de dados: Ler uma palavra sem espaços
    
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in) // comando para entrada de dados, e tambem importar a biblioteca la em cima
        ) {
            String x;                            // variavel String recebe x
            x = sc.next();                       // x é a variavel, sc.next é o comando para ler o conteudo de x
            System.out.println("Você digitou: " + x);
            // para encerrar o comando sc
        } // variavel String recebe x
        
    }
}

