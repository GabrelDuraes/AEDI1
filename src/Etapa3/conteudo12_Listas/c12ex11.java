package Etapa3.conteudo12_Listas;
import java.util.Scanner;
public class c12ex11 {
    public static void main(String[] args) {
        String nome[]=new String[8],nomeMa="";
        double nota[]=new double[8],notaMa=0;
        Scanner tec=new Scanner(System.in);
        for (int aux=0;aux< nome.length;aux++){
            System.out.println("Informe o nome do aluno(a): ");
            nome[aux]=tec.nextLine();
            System.out.println("Informe a nota do aluno(a) "+nome[aux]+":");
            nota[aux]= tec.nextDouble();
            tec.nextLine();
        }
        for(int aux=0;aux<nome.length;aux++){
            if (aux == 0 || nota[aux]>notaMa){
                notaMa=nota[aux];
                nomeMa=nome[aux];
            }
        }
        System.out.println("Aluno(a) com maior nota dentre as notas informadas: "+nomeMa);
        tec.close();
    }
}
