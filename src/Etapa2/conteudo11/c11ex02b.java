package Etapa2.conteudo11;

import java.util.Scanner;

public class c11ex02b {
    public static void main(String[] args) {
        String nome,nomeMenor="";
        double valApl,soma=0,somaTo=0,menorVal=0,mediaBro;
        int contBro=0,contPra=0,contOu=0,cont=0;
        Scanner tec= new Scanner(System.in);
        do {
            cont++;
            System.out.println("Informe o nome do cliente: ");
            nome = tec.nextLine();
            System.out.println("Informe o valor aplicado do cliente: ");
            valApl = tec.nextDouble();
            somaTo += valApl;
            if (valApl <= 1000) {
                System.out.println("Cliente " + nome + " tem sua classificação Bronze.");
                contBro++;
                soma += valApl;
            } else if (valApl > 1000 && valApl <= 5000) {
                System.out.println("Cliente " + nome + " tem sua classificação Prata.");
                contPra++;
            } else {
                System.out.println("Cliente " + nome + " tem sua classificação Ouro.");
                contOu++;
            }
            if (cont==1 || valApl < menorVal) {
                menorVal = valApl;
                nomeMenor = nome;
            }
            tec.nextLine();
        }while (!(nome.equalsIgnoreCase("Reynaldo Duarte")));
        mediaBro=soma/contBro;
        System.out.println();
        System.out.println("Clientes com classificacao Bronze: "+contBro+"\n" +
                "Clientes com classificacao Prata: "+contPra+"\n" +
                "Clientes com classificacao Ouro: "+contOu+"\n" +
                "Media dos valores aplicados dos clientes Bronze: R$"+mediaBro+"\n" +
                "Valor total em aplicacao: R$"+somaTo+"\n" +
                "Cliente com menor aplicacao: "+nomeMenor);
        tec.close();
    }
}