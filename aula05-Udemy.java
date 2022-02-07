import java.util.Scanner;

public class aula05 { // exemplo de if/else encadeados
    public static void main(String[] args) {

        try (Scanner ler = new Scanner(System.in)) {
            int num;
            
            System.out.println("Digite um número: ");

            num = ler.nextInt();

            if (num > 10){
                System.out.println("O numero digitado é maior que 10");
            }else
            if (num < 10){
                System.out.println("O numero digitado é menor que 10");
            }else{
                System.out.println("O numero digitado é igual a 10");
            }
        }
    }
}
