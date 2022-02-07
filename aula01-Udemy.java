import java.util.Locale; // biblioteca do locale

public class aula01 { // exemplo das variaveis
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); // locale serve para que o separador de decimais seja o ponto e nao a virgula

        int idade;
        double salario, altura;
        char genero;
        String nome;

        idade = 30;
        salario = 5800.5;
        altura = 1.72;
        genero = 'F';
        nome = "Maria Silva";

        System.out.println("IDADE = " + idade);
        System.out.println("SALARIO = " + String.format("%.2f", salario));  // para o salario aparecer com duas casas decimais usamos String.format("%.2f") antes da variavel salario
        System.out.println("ALTURA = " + altura);
        System.out.println("GENERO = " + genero);
        System.out.println("NOME = " + nome);
    }
}
