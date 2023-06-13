package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex25 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        String[] nome=new String[4];
        int[] pont=new int[4];
        int tempPo,pos=-1;
        String tempNome,varAux;
        for (int aux=0;aux<nome.length;aux++){
            System.out.println("Informe o nome da equipe: ");
            nome[aux]=tec.nextLine();
            System.out.println("Informe a pontuacao que a "+nome[aux]+" tem: ");
            pont[aux]=tec.nextInt();
            tec.nextLine();
        }
        for (int aux=0;aux<pont.length-1;aux++) {
            for (int x = 0; x < pont.length - 1; x++) {
                if (pont[aux] < pont[aux + 1]) {
                    tempNome = nome[aux];
                    tempPo = pont[aux];
                    pont[aux] = pont[aux + 1];
                    pont[aux + 1] = tempPo;
                    nome[aux] = nome[aux + 1];
                    nome[aux + 1] = tempNome;
                }
            }
        }
        System.out.println("Informe o nome da equipe que deseja procurar: ");
        varAux=tec.nextLine();
        for (int aux=0;aux<nome.length;aux++){
            if (varAux.equalsIgnoreCase(nome[aux]))
                pos=aux;
        }
        pos=pos+1;
        if (pos<=4&&pos>=1) {
            System.out.println(varAux+" esta Copa Libertadores na posicao: "+pos);
        } else if (pos<=12) {
            System.out.println(varAux+" esta na Copa Sul-americanana na posicao: "+pos);
        }
        else if (pos>=17&&pos<=20){
            System.out.println(varAux + " esta Rebaixado na posicao: "+pos);
        }
        else
            System.out.println("Equipe nao encontrada");
        tec.close();
        
    }
}
