public class aula07 { // Concatenar vários elementos em um mesmo comando
    
    public static void main(String[] args) {
        
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);

        // para concatenar varios elementos em uma so linha, precisa-se colocar um
        // -- printf -- e usar marcadores na linha para indicar os valores das variaveis

        // %s é o marcador de String nome      (texto)
        // %d é o marcador de idade            (inteiro)
        // %f é o marcador de double           (ponto flutuante)

        // usando os marcadores no final basta colocar as variaveis, nome, idade, renda.

    }
}
