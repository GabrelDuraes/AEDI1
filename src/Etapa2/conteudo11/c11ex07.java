package Etapa2.conteudo11;

import java.util.Scanner;

public class c11ex07 {
    public static void main(String[] args) {
        int menorTemp=0,maiorTemp=0,contMai=0,temp,somaTemp=0;
        double mediaTemp;
        Scanner tec=new Scanner(System.in);
        for (int aux=1;aux<=121;aux++){
            System.out.print("Informe a temperatura do dia "+aux+": ");
            temp=tec.nextInt();
            somaTemp+=temp;
            if (aux==1||temp<menorTemp)
                menorTemp=temp;
            if (aux==1||temp>maiorTemp){
                maiorTemp=temp;
                contMai=0;
            }
            if (temp==maiorTemp)
                contMai++;
        }
        mediaTemp=somaTemp/121.0;
        System.out.println("Menor temperatura registrada: "+menorTemp+"\n" +
                "Maior temperatura registrada: "+maiorTemp+"\n" +
                "Media das temperaturas registradas: "+mediaTemp+"\n" +
                "Quantidade de dias que ocorreu a maior temperatura: "+contMai);
        tec.close();
    }
}
