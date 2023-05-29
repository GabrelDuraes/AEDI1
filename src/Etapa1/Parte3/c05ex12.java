package Etapa1.Parte3;
import java.util.Scanner;
public class c05ex12 {
    public static void main(String[] args) {
        int tempEven,horas,segundos,minutos;
        Scanner telcado=new Scanner(System.in);
        System.out.print("Informe o tempo do evento em segundos:");
        tempEven= telcado.nextInt();
        horas=tempEven/3600;
        minutos=(tempEven-horas*3600)/60;
        segundos=tempEven%60;
        System.out.println("Segundos do Evento:"+tempEven+
                "\nHoras:"+horas+
                "\nMinutos:"+minutos+
                "\nSegundos:"+segundos);
        telcado.close();
    }
}
