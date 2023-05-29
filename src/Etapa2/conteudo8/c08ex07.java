package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex07 {
    public static void main(String[] args) {
        String nome;
        int idade, contIdade=0,contTrinta=0,rep,soma=0;
        double media;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe a quantidade de alunos: ");
        rep=teclado.nextInt();
        teclado.nextLine();
        for (int aux=1;aux<=rep;aux++){
            System.out.println("Informe o seu nome: ");
            nome=teclado.nextLine();
            System.out.println("Informe a idade de "+nome+" : ");
            idade=teclado.nextInt();
            soma+=idade;
            if (idade<=12)
                contIdade++;
            else if (idade>=30)
                contTrinta++;
            teclado.nextLine();
        }
        media=(float)soma/rep;
        System.out.println("Alunos que tem at� 12 anos: "+contIdade+"\n" +
                "Alunos que tem acima de 30 anos: "+contTrinta+"\n" +
                "Media das idades informadas: "+media);
        teclado.close();
    }
}
