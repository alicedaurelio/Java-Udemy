public class aula03 { // exemplo de for
    public static void main(String[] args) {
        
        System.out.println("Soma dos números ");

        int soma=0;

        for (int x = 0; x <= 20; x++){
            soma = soma + x;
        } // final do for

        System.out.println(soma);

        System.out.println("Tabuada de um número");

        int numTabuada = 5;

        for (int y = 0; y <=10; y++){
            System.out.println(y * numTabuada);
        }
    }
}
