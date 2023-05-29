package Etapa3.conteudo12;

import java.util.Scanner;

public class c12ex14 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        String[] NomCid=new String[100],estCid=new String[100];
        int[] popuCid=new int[100];
        String tempNom,tempEst;
        int tempPo,posicao;
        for(int aux=0;aux<NomCid.length;aux++){
            System.out.println("Informe o nome da sua cidade: ");
            NomCid[aux]=tec.nextLine();
            System.out.println("Informe a populacao da cidade "+NomCid[aux]+":");
            popuCid[aux]=tec.nextInt();
            tec.nextLine();
            System.out.println("Informe de qual estado � a cidade "+NomCid[aux]+":");
            estCid[aux]=tec.nextLine();
        }
        for (int aux=0;aux<NomCid.length;aux++){
            for (int x=0;x<NomCid.length-1;x++){
                if (popuCid[x]<popuCid[x+1]){
                    tempNom=NomCid[x];
                    tempEst=estCid[x];
                    tempPo=popuCid[x];
                    popuCid[x]=popuCid[x+1];
                    estCid[x]=estCid[x+1];
                    NomCid[x]=NomCid[x+1];
                    popuCid[x+1]=tempPo;
                    estCid[x+1]=tempEst;
                    NomCid[x+1]=tempNom;
                }
            }
        }
        for (int aux=0;aux<10;aux++){
            posicao=aux+1;
            System.out.println(posicao+" cidade com maior populacao: "+NomCid[aux]+", "+estCid[aux]);
        }
        tec.close();
    }
}
