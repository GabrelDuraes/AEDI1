package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex13 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String[] Nome=new String[12];
        String temp;
        for (int aux=0;aux< Nome.length;aux++){
            System.out.println("Informe um mes: ");
            Nome[aux]=tec.nextLine();
        }
        for(int aux=0;aux< Nome.length-1;aux++){
            for (int x=0;x<Nome.length-1;x++){
                if (Nome[x].compareToIgnoreCase(Nome[x+1])>0){
                    temp=Nome[x];
                    Nome[x]=Nome[x+1];
                    Nome[x+1]=temp;
                }
            }
        }
        for (int aux=0;aux<Nome.length;aux++){
            System.out.print(Nome[aux]+" ");
        }
    }
}
