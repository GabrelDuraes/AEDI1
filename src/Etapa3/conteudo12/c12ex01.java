
package Etapa3.conteudo12;

import java.util.Scanner;

public class c12ex01 {
    public static void main(String[] args) {
        int vet[] =new int[10],cont=0;
        Scanner tec=new Scanner(System.in);
        for (int aux=0;aux<vet.length;aux++){
            System.out.println("Informe um valor:");
            vet[aux]=tec.nextInt();
        }
        for (int aux=0;aux<vet.length;aux++){
            if(vet[aux]%5==0&&vet[aux]%7==0){
                cont++;
            }
        }
        System.out.println("Quantidades de divisores de 5 e 7 ao mesmo tempo: "+cont);
        tec.close();
    }
}
