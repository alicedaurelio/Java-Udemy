public class aula10 {
    public static void main(String[] args) {
        
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a / b;  /* colocando double depois do resultado receber as variaveis. Para indicar
                                     que você quer o resultado double 2.5 e nao inteiro 2.0*/

                                     
        System.out.println(resultado); /* O resultado tinha que sair 2,5 mas quando executa saiu 2,0. 
                                        Cortou o 5 do numero. Porque as variaveis a e b ambas sao do tipo inteiro
                                        então o compilador vai entender que o resultadi tem que sair inteiro.
                                        Para o compilador entender que você quer que saia os quebrados tambem
                                        tem que colocar (double) antes das variaveis no resultado*/
    }
}
