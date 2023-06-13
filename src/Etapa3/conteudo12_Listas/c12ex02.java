package Etapa3.conteudo12_Listas;


import java.util.Scanner;

public class c12ex02 {
    public static void main(String[] args) {
        int vet[] = new int[10];
        Scanner tec = new Scanner(System.in);
        for (int aux = 0; aux< vet.length;aux++){
            System.out.println("Informe um valor: ");
            vet[aux]=tec.nextInt();
        }
        for (int aux = 0; aux< vet.length;aux++){
            if (vet[aux]>5&&vet[aux]<10){
                System.out.println("Numeros maiores que 5 e menores que 10: "+vet[aux]);
            }
        }
        tec.close();
    }
}
