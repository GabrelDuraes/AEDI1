package Etapa2.cont10_Infect;

import java.util.Scanner;

public class c10ex05 {
    public static void main(String[] args) {
        double peso,altura,somaH=0,media;
        String sex;
        int contTo=0,contF=0,contH=0,contPF=0;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Para finalizar o programa, digite 0 em altura..");
        do {
            System.out.print("Informe a altura do funcionario: ");
            altura=teclado.nextDouble();
            if (altura==0)
                break;
            System.out.print("Informe o peso do funcionario: ");
            peso=teclado.nextDouble();
            teclado.nextLine();
            System.out.print("Informe o sexo do funcionario(M para masculino, F para Feminino): ");
            sex=teclado.nextLine();
            contTo++;
            if (sex.equalsIgnoreCase("f"))
                contF++;
            if (sex.equalsIgnoreCase("m")){
                somaH+=altura;
                contH++;
            }
            if (sex.equalsIgnoreCase("F")&&peso<60)
                contPF++;
        }while (altura!=0);
        media=somaH/contH;
        System.out.println();
        System.out.println("Quantidade de pessoas pesquisadas: "+contTo+"\n" +
                "Quantidade de mulheres: "+contF+"\n" +
                "Altura media dos homens: "+media+"\n" +
                "Quantidade de mulheres com peso menor que 60: "+contPF);
        teclado.close();
    }
}
