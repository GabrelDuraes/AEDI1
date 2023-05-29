package Etapa2.conteudo8;
import java.util.Scanner;
public class c08ex05 {
    public static void main(String[] args) {
        int cand,cont1,cont2,cont3;
        String candV;
        Scanner teclado=new Scanner(System.in);
        cont1=0;
        cont2=0;
        cont3=0;
        for (int aux=1;aux<=100;aux++) {
            System.out.println("Inforome o seu candidato: 1-Fulano, 2-Ciclano, 3-Beltrano");
            cand = teclado.nextInt();
            switch (cand){
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
            }
        }
        if (cont1>cont2&&cont1>cont3)
            candV="Fulano";
        else if (cont2>cont1&&cont2>cont3)
            candV="Ciclano";
        else
            candV="Beltrano";
        System.out.println("Fulano: "+cont1+"\nCiClano: "+cont2+"\nContador: "+cont3+"\nCandidato vencedor: "+candV);
    }
}
