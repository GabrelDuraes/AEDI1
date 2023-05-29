package Etapa2.cont10_Infect;
import java.util.Scanner;
public class c10ex08 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String nome,nomeMenor="";
        int popu,numElei,qtdMulher,qtdHomem,somaPopu,contTo=0,popuTo=0,
                percentEle, contMu=0,somaHom=0,contH=0,cidaMen=0,media;
        do {
            System.out.println("Informe o nome da cidade: ");
            nome=teclado.nextLine();
            System.out.println("Informe a populacao de "+nome+": ");
            popu=teclado.nextInt();
            System.out.println("Informe a quantidade de eleitores da cidade: ");
            numElei=teclado.nextInt();
            System.out.println("Informe a quantidade de homens da cidade: ");
            qtdHomem=teclado.nextInt();
            System.out.println("Informe a quantidade de mulheres da cidade: ");
            qtdMulher=teclado.nextInt();
            somaPopu=qtdHomem+qtdMulher;
            if (popu!=somaPopu)
                System.out.println("Soma dos homens com as mulheres � diferente da populacao da cidade.");
            contTo++;
            popuTo+=popu;
            percentEle=(100*numElei)/popu;
            if (qtdMulher>qtdHomem)
                contMu++;
            if (qtdHomem<popu){
                somaHom+=qtdHomem;
                contH++;
            }
            if (cidaMen>popu||contTo==1){
                nomeMenor=nome;
                cidaMen=popu;
            }
            teclado.nextLine();
        }while (!nome.equalsIgnoreCase("zimbabue de minas"));
        media=somaHom/contH;
        System.out.println("Quantidade total de cidades do estado: "+contTo+"\n" +
                "Populacao total do estado: "+popuTo+"\n" +
                "Percentual de eleitores: "+percentEle+"%\n" +
                "Quantidade de cidades cuja populacao tem mais mulheres: "+contMu+"\n" +
                "Media de homens: "+media+"\n" +
                "Nome da cidade de menor populacao do estado: "+nomeMenor);
        teclado.close();
    }
}