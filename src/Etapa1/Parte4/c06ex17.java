package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex17 {
    public static void main(String[] args) {
        String perg1,perg2,perg3,perg4,perg5,perg6,perg7,perg8,perg9;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Respoda com V(verdadeiro) ou F(falso):");
        System.out.println("Voc� tem curso t�cnico de programa��o? ");
        perg1=teclado.nextLine();
        System.out.println("Voc� tem curso superior de programa��o? ");
        perg2=teclado.nextLine();
        System.out.println("Voc� tem menos de 3 anos de experi�ncia em programa��o? ");
        perg3= teclado.nextLine();
        System.out.println("Voc� se considera uma pessoa criativa? ");
        perg4=teclado.nextLine();
        System.out.println("Voc� prefere liderar a ser liderado? ");
        perg5=teclado.nextLine();
        System.out.println("Voc� prefere trabalhar sozinho a trabalhar em equipe? ");
        perg6=teclado.nextLine();
        System.out.println("Voc� � autodidata (aprende sozinho)? ");
        perg7=teclado.nextLine();
        System.out.println("Voc� aceitaria uma remunera��o inicial de R$1500? ");
        perg8=teclado.nextLine();
        System.out.println("Voc� s� aceitaria trabalhar em escrit�rios da empresa dentro da grande BH? ");
        perg9=teclado.nextLine();
        if (perg1.equalsIgnoreCase("v")&&perg2.equalsIgnoreCase("f")&&perg3.equalsIgnoreCase("v")){
            System.out.println("Voce nao esta apto para trabalhar na empresa.");
        }
        else{
            if (perg5.equalsIgnoreCase("v")&&perg8.equalsIgnoreCase("v")){
            System.out.println("Voce nao esta apto para trabalhar na empresa.");
        }
            else{
                if (perg4.equalsIgnoreCase("f")||perg6.equalsIgnoreCase("v")||perg7.equalsIgnoreCase("f")||perg9.equalsIgnoreCase("v")){
            System.out.println("Voce nao esta apto para trabalhar na empresa.");
                }
                else
            System.out.println("Voce esta apto para trabalhar na empresa.");
        teclado.close();
            }
        }
    }
}
