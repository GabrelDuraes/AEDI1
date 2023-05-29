package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex11 {
    public static void main(String[] args) {
        String nomEquipe1,nomEquipe2;
        int placarEq1,placarEq2,ptsEq1,ptsEq2;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Qual o nome da primeira equipe? ");
        nomEquipe1=teclado.nextLine();
        System.out.print("Qual o nome da segunda equipe? ");
        nomEquipe2=teclado.nextLine();
        System.out.print("Qual a pontua��o da primeira equipe? ");
        placarEq1=teclado.nextInt();
        System.out.print("Qual a pontua��o da segunda equipe? ");
        placarEq2=teclado.nextInt();
        if (placarEq1==3&&placarEq2<=1){
            ptsEq1=3;
            ptsEq2=0;
            System.out.println("Equipe 1: "+nomEquipe1+"   Equipe 2: "+nomEquipe2+"\n" +
                    "Pontos "+nomEquipe1+": "+ptsEq1+"      Pontos "+nomEquipe2+": "+ptsEq2);
        }
        else{
            if (placarEq1==3&&placarEq2==2){
                ptsEq1=2;
                ptsEq2=1;
                System.out.println("Equipe 1: "+nomEquipe1+"   Equipe 2: "+nomEquipe2+"\n" +
                        "Pontos "+nomEquipe1+": "+ptsEq1+"   Pontos "+nomEquipe2+": "+ptsEq2);
            }
            else if (placarEq1<=1&&placarEq2==3){
                ptsEq2=3;
                ptsEq1=0;
                System.out.println("Equipe 1: "+nomEquipe1+"   Equipe 2: "+nomEquipe2+"\n" +
                        "Pontos "+nomEquipe1+": "+ptsEq1+"      Pontos "+nomEquipe2+": "+ptsEq2);
            }
            else if (placarEq2==3&&placarEq1==2){
                ptsEq2=2;
                ptsEq1=1;
                System.out.println("Equipe 1: "+nomEquipe1+"   Equipe 2: "+nomEquipe2+"\n" +
                        "Pontos "+nomEquipe1+": "+ptsEq1+"   Pontos "+nomEquipe2+": "+ptsEq2);
            }
        }
        teclado.close();
    }
}
