package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex07 {
    public static void main(String[] args) {
        double salario, fix1=500,fix2=200,fix3=0,plBruto,impos,plLiquid;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Insira o valor do seu salario:");
        salario= teclado.nextDouble();
        if (salario<=300){
            plBruto=fix1+(salario*70/100);
            impos=plBruto*25/100;
            plLiquid=plBruto-impos;
            System.out.printf("Sua participa��o nos lucros �:%.2f ",plLiquid);
        }
        else{
            if (salario>300&&salario<=1000){
                plBruto=fix2+(salario*50/100);
                impos=plBruto*25/100;
                plLiquid=plBruto-impos;
                System.out.printf("Sua participa��o nos lucros �:%.2f ",plLiquid);
            }
            else{
                plBruto=fix3+(salario*30/100);
                impos=plBruto*25/100;
                plLiquid=plBruto-impos;
                System.out.printf("Sua participa��o nos lucros �%.2f: ",plLiquid);
            }
        }
        teclado.close();
    }
}
