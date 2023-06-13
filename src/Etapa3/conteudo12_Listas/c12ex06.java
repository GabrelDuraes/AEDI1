package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex06 {
    public static void main(String[] args) {
        String Nome[]=new String[12];
        Scanner tec=new Scanner(System.in);
        for (int aux=0;aux< Nome.length;aux++){
            System.out.println("Informe os meses em ordem: ");
            Nome[aux]=tec.nextLine();
        }
        for (int aux=Nome.length-1;aux>=0;aux--){
            System.out.println(Nome[aux]);
        }
    }
}
