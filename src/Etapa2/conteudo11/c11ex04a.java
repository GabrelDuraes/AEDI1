package Etapa2.conteudo11;

import java.util.Scanner;

public class c11ex04a {
    public static void main(String[] args) {
        String nome, sex,nomeMa="";
        int idade, qtdPontos, somaId = 0, contId = 0, contMas = 0,rep,contF=0,idadeMa=0;
        double multa, mediaId, somaMult = 0, percent;
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe a quantidade de multas que sera lida: ");
        rep=tec.nextInt();
        for (int aux = 1; aux <= rep; aux++) {
            System.out.println("Informe o nome do condutor: ");
            nome = tec.nextLine();
            System.out.println("Informe a idade do condutor: ");
            idade = tec.nextInt();
            do {
                System.out.println("Informe o seu sexo(F ou M): ");
                sex=tec.nextLine();
                if (!sex.equalsIgnoreCase("F")&&!sex.equalsIgnoreCase("M"))
                    System.out.println("Codigo invalido! Informe novamente.");
            }while (!sex.equalsIgnoreCase("F")&&!sex.equalsIgnoreCase("M"));
            System.out.println("Informe a quantidade de pontos que o condutor perdeu na carteira: ");
            qtdPontos = tec.nextInt();
            System.out.println("Informe o valor da multa que o condutor recebeu: ");
            multa = tec.nextInt();
            somaId += idade;
            contId++;
            somaMult += multa;
            if (sex.equalsIgnoreCase("M"))
                contMas++;
            if (sex.equalsIgnoreCase("F")&&qtdPontos==7)
                contF++;
            if (contId==1||idade>idadeMa){
                nomeMa=nome;
                idadeMa=idade;
            }
            tec.nextLine();
        }
        mediaId = (float) somaId / contId;
        percent = contMas * 100.0 / rep;
        System.out.println("Idade media dos condutores: "+mediaId+"\n" +
                "Valor total das multas: R$"+somaMult+"\n" +
                "Percentual de homens multados: "+percent+"%"+"\n" +
                "Quantidade de mulheres que perderam 7 pontos na carteira: "+contF+"\n" +
                "Nome e idade da pessoa mais velha: "+nomeMa+", "+idadeMa+" anos.");
        tec.close();
    }
}