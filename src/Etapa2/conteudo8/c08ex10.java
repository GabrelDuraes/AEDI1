package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex10 {
    public static void main(String[] args) {
        String nome,nomeMaior="";
        double precoUni,total,soma=0,precoMaior=0,media;
        int qtdConsu,rep;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe o numero de insumos que sera utilizado: ");
        rep=teclado.nextInt();
        for (int aux=1;aux<=rep;aux++){
            teclado.nextLine();
            System.out.println("Informe o nome do insumo: ");
            nome=teclado.nextLine();
            System.out.println("Informe o preço unitario de "+nome+": ");
            precoUni=teclado.nextDouble();
            System.out.println("Informe a quantidade do "+nome+": ");
            qtdConsu=teclado.nextInt();
            total=qtdConsu*precoUni;
            soma+=total;
            if (aux==1||total>precoMaior) {
                precoMaior = total;
                nomeMaior = nome;
            }
        }
        media=soma/rep;
        System.out.println("Custo total do projeto: R$"+soma+"\nMedia dos custos parciais: R$"+media+"\n" +
                "O nome do insumo de maior custo parcial: "+nomeMaior);
        teclado.close();
    }
}
