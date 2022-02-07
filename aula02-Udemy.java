public class aula02   { // exemplo das variaveis
    public static void main(String[] args) {
        
        int ht;       // horas trabalhadas no mês
        double vh;   // valor da hora aula
        double pd;  // percentual de desconto
        double sb;  // salario bruto obtido pela multiplicacao de ht e vh
        double td;  // total de desconto obtido pela divisão de pd por 100 multiplicado por sb
        double sl;  // salario liquido calculado pela subtração dos descontos do sb

        // Exibir na tela os valores do salario liquido e do salario bruto

        ht = 80;
        vh = 50.0D;     // como a variavel é double colocar o D no final dos valores
        pd = 4.5D;
        sb = ht * vh;
        td = (pd / 100) * sb;
        sl = sb - td;

        System.out.println("Salário bruto = " + sb);
        System.out.println("Salário líquido = " + sl);
    }

}