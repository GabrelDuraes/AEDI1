package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex13 {
    public static void main(String[] args) {
        String nomeCidade,nomeMenor="";
        int populacao,qtdEleitores,qtdMulher,qtdHomens,soma,contCidade=0,contMaior=0,menorPop=0;
        double percEleitores;
        Scanner arquivo=new Scanner(c08ex13.class.getResourceAsStream("c08ex13.txt"));
        for (int aux=1;aux<=5;aux++) {
            nomeCidade = arquivo.nextLine();
            populacao = arquivo.nextInt();
            qtdEleitores = arquivo.nextInt();
            qtdMulher = arquivo.nextInt();
            qtdHomens = arquivo.nextInt();
            soma=qtdHomens+qtdMulher;
            if (soma>populacao||soma<populacao)
                System.out.println("Cidade "+nomeCidade+" tem a soma de homens e mulheres não é o mesmo que o da populacao.");
            percEleitores=(qtdEleitores*100.0)/populacao;
            System.out.println("Percentual de eleitores em relacao a populacao é de: "+percEleitores+"%.");
            if (populacao>1000000)
                contCidade++;
            if (qtdMulher>qtdHomens)
                contMaior++;
            if (aux==1||populacao<menorPop) {
                menorPop = populacao;
                nomeMenor=nomeCidade;
            }
            arquivo.nextLine();
        }
        System.out.println("Cidades com mais de 1.000.000 de habitantes: "+contCidade+"\n" +
                "Cidades com mais mulheres que homens: "+contMaior+"\n" +
                "Cidade com menor população: "+nomeMenor);
        arquivo.close();
    }
}
