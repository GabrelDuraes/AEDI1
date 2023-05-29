package Etapa2.conteudo11;

import java.util.Scanner;

public class c11ex05 {
    public static void main(String[] args) {
        String nome;
        int codOp,contIn=0,contFr=0,contEs=0,cont;
        double mensal,somaIn=0,somafr=0,somaEs=0, mediaMensal;
        Scanner tec=new Scanner(System.in);
        System.out.println("Para encerrar, digite FIM no nome do aluno.");
        do {
            System.out.println("Informe o nome do aluno: ");
            nome=tec.nextLine();
            if (nome.equalsIgnoreCase("FIM")){
                System.out.println("Programa finalizado.");
                break;
            }
            do {
                System.out.println("Informe o Codigo da Opcao do aluno: ");
                codOp = tec.nextInt();
                if (codOp!=1&&codOp!=2&&codOp!=3)
                    System.out.println("Codigo invalido! Digite novamente: ");
            }while (codOp!=1&&codOp!=2&&codOp!=3);
                switch (codOp) {
                    //Ingles:
                    case 1:
                        mensal = 100;
                        contIn++;
                        somaIn += mensal;
                        System.out.println("Aluno :" + nome + "\n" +
                                "Mensalidade: R$" + mensal);
                        break;
                    //Frances:
                    case 2:
                        mensal = 150;
                        contFr++;
                        somafr += mensal;
                        System.out.println("Aluno :" + nome + "\n" +
                                "Mensalidade: R$" + mensal);
                        break;
                    //Espanhol:
                    case 3:
                        mensal = 120;
                        contEs++;
                        somaEs += mensal;
                        System.out.println("Aluno :" + nome + "\n" +
                                "Mensalidade: R$" + mensal);
                        break;
                }
        }while (!nome.equalsIgnoreCase("FIM"));
        cont=contEs+contIn+contFr;
        mediaMensal =(somaEs+somafr+somaIn)/cont;
        System.out.println("Quantidade de alunos nas turmas de ingles: "+contIn+"\n" +
                "Mensalidade media da escola: "+mediaMensal+"\n" +
                "Valor total da mensalidade em ingles: "+somaIn+"\n" +
                "Valor total da mensalidade em Frances: "+somafr+"\n" +
                "Valor total da mensalidade em Espanhol: "+somaEs);
        tec.close();
    }
}
