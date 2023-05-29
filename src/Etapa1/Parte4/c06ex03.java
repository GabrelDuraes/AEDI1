package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex03 {
    public static void main(String[] args) {
        float valMensal,salario,valFix=240;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Qual foi o valor mensal das vendas?");
        valMensal= teclado.nextFloat();
        if (valMensal<=1000){
            salario=valFix+0;
        }
        else{
            if (valMensal>751000&&valMensal<=10000){
                salario=valFix+(valMensal*10/100);
            }
            else{
                salario=valFix+1000;
            }
        }
        System.out.println("Salario:R$ "+salario);
        teclado.close();
    }
}
