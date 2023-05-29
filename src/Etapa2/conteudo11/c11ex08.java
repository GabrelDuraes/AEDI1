package Etapa2.conteudo11;
import java.util.Scanner;
public class c11ex08 {
    public static void main(String[] args) {
        String nome, funcao, ultNome, maiorFun = "", nomeMaior = "";
        double valVoras = 0, hrsTrabalha, qtdRecebe, premio = 0, somahr = 0, media, somaTO = 0, maiorSal = 0;
        int contPe = 0, cont1 = 0, cont2 = 0, cont3 = 0;
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o valor da hora trabalhada: ");
        valVoras = tec.nextDouble();
        System.out.println("Informe o ultimo nome que sera informado: ");
        ultNome = tec.nextLine();
        do {
            System.out.println("Informe o nome do trabalhador: ");
            nome = tec.nextLine();
            contPe++;
            System.out.println("Informe a funcao do trabalhador " + nome + ": ");
            funcao = tec.nextLine();
            System.out.println("Informe a quantidade de horas trabalhadas de " + nome + ":");
            hrsTrabalha = tec.nextDouble();
            somahr += hrsTrabalha;
            if (hrsTrabalha <= 100) {
                premio = 1000;
                cont1++;
            } else if (hrsTrabalha <= 500) {
                premio = 10 * hrsTrabalha;
                cont2++;
            } else {
                premio = 100 * (hrsTrabalha / 10.0);
                cont3++;
            }
            qtdRecebe = hrsTrabalha * valVoras + premio;
            somaTO += qtdRecebe;
            if (contPe == 1 || maiorSal < qtdRecebe) {
                maiorSal = qtdRecebe;
                nomeMaior = nome;
                maiorFun = funcao;
            }
            System.out.println("O trabalhador " + nome + " ira receber R$" + qtdRecebe);
        } while (ultNome.equalsIgnoreCase(nome));
        media = somahr / contPe;
        System.out.println("Media de horas trabalhadas por pessoa: " + media + "\n" +
                "Nome e funcao da pessoa que recebe o maior salario: " + nomeMaior + ", funcao: " + maiorFun + "\n" +
                "Quantidade de pessoas que receberam o primeiro premio: " + cont1 + "\n" +
                "Quantidade de pessoas que receberam o segundo premio: " + cont2 + "\n" +
                "Quantidade de pessoas que receberam o terceiro premio: " + cont3 + "\n" +
                "Valor total da folha de pagamento: " + somaTO);
        tec.close();
    }
}
