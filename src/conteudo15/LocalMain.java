package conteudo15;

import java.util.Scanner;

public class LocalMain {
    public static void main(String[] args) {
        String pontoTu,cep,nome,estado;
        int popu;
        Scanner tec=new Scanner(System.in);
        System.out.print("Digite o nome da cidade: ");
        nome=tec.nextLine();
        System.out.print("Digite o CEP de "+nome+": ");
        cep=tec.nextLine();
        System.out.print("Digite o estado dessa cidade: ");
        estado=tec.nextLine();
        System.out.print("Digite a populacao da cidade "+nome+": ");
        popu=tec.nextInt();
        tec.nextLine();
        System.out.print("Informe um ponto turistico dessa cidade: ");
        pontoTu=tec.nextLine();
        Local c1=new Local(nome,cep,estado,popu,pontoTu);
        System.out.println();
        c1.Imprimir();
        tec.close();
    }
}
