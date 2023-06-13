package conteudo15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LocalMain {
    public static void main(String[] args) {
        List<String> cidade=new ArrayList<>();
        String pontoTu,cep,nome,estado;
        int popu,anoAt,anoCri,hom,mul;
        Scanner tec=new Scanner(System.in);
        System.out.println("Digite x para encerrar o programa.");
        do {
            System.out.println("Digite o nome da cidade: ");
            nome = tec.nextLine();
            if (nome.equalsIgnoreCase("x"))
                break;
            System.out.println("Digite o CEP de " + nome + ": ");
            cep = tec.nextLine();
            System.out.println("Digite o estado dessa cidade: ");
            estado = tec.nextLine();
            System.out.println("Digite a populacao da cidade " + nome + ": ");
            popu = tec.nextInt();
            tec.nextLine();
            System.out.println("Informe um ponto turistico dessa cidade: ");
            pontoTu = tec.nextLine();
            System.out.println("Informe o ano atual: ");
            anoAt = tec.nextInt();
            System.out.println("Informe o ano que a cidade foi fundada: ");
            anoCri = tec.nextInt();
            System.out.println("Quantos homens tem na sua casa?(se nao tiver, digite 0) ");
            hom = tec.nextInt();
            System.out.println("Quantas mulheres tem na sua casa?(se nao tiver, digite 0)");
            mul = tec.nextInt();
            Sexo c1 = new Sexo(nome, cep, estado, popu, pontoTu, hom, mul);
            System.out.println();
            c1.Imprimir();
            c1.AnoCid(anoAt, anoCri);
            c1.quantidade(hom, mul);
            tec.nextLine();
        }while (!(nome.equalsIgnoreCase("x")));
        tec.close();
    }
}
