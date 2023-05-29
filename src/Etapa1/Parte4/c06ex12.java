package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex12 {
    public static void main(String[] args) {
        double valCaixa,precoAluguel,precoCaixa,aluguel,custoTotal;
        int qtdBola,defBola,qtdMes,qtdcaixa,galpao;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Quantas bolas foram produzidas?");
        qtdBola= teclado.nextInt();
        System.out.println("Quantas bolas est�o com defeito?");
        defBola= teclado.nextInt();
        System.out.println("Qual o pre�o de cada caixa de papel�o?");
        precoCaixa= teclado.nextDouble();
        System.out.println("Quantos meses faltam para a copa?");
        qtdMes= teclado.nextInt();
        System.out.println("Qual o valor mensal do aluguel?");
        aluguel= teclado.nextDouble();
        qtdcaixa=(qtdBola-defBola)/10;
        if ((qtdBola-defBola)%10>0)
            qtdcaixa++;
        galpao=qtdcaixa/850;
        if (qtdcaixa%850>0)
            galpao++;
        precoAluguel=galpao*aluguel;
        valCaixa=qtdcaixa*precoCaixa;
        custoTotal=(precoAluguel*qtdMes)+valCaixa;
        System.out.println("Produ��o de bolas: "+qtdBola+"\n"+
                "Caixa de papel�o:"+precoCaixa+"\n"+
                "Meses para a Copa: "+qtdMes+"\n"+
                "Bolas com defeito: "+defBola+"\n"+
                "Alguel mensal: "+aluguel+"\n"+
                "Custo total: "+custoTotal);
        teclado.close();
    }
}
