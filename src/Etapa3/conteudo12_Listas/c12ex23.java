package Etapa3.conteudo12_Listas;

import java.util.Scanner;

public class c12ex23 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        String[] placa=new String[100],nomeCar=new String[100];
        String varAux;
        int posicao,pos=-1;
        for (int aux=0;aux<placa.length;aux++){
            posicao=aux+1;
            System.out.println("Informe a placa do veiculo que esta na "+posicao+"º vaga: ");
            placa[aux]=tec.nextLine();
            System.out.println("Informe o nome do dono do veiculo com placa "+placa[aux]+":");
            nomeCar[aux]=tec.nextLine();
        }
        System.out.println("Informe o nome ou a placa que deseja procurar: ");
        varAux=tec.nextLine();
        for (int aux=0;aux< nomeCar.length;aux++){
            if(varAux.equalsIgnoreCase(nomeCar[aux])||varAux.equalsIgnoreCase(placa[aux]))
                pos=aux;
        }
        if (pos==-1) {
            System.out.println("Vaga nao encontrada");
        }
        else
            System.out.println("Vaga :"+pos);
        tec.close();
    }
}
