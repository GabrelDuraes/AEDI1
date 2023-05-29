package Etapa2.conteudo11;
import java.util.Scanner;
public class c11ex06 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String ligada, maisAssis;
        int canais, pessoas, contVisitas = 0, soma4 = 0, soma7 = 0, soma12 = 0, contDesl = 0, casasAssi, somaTo = 0;
        double percentual4, percentual7, percentual12, media;
        do {
            contVisitas++;
            System.out.println("A televisao estava ligada(sim ou nao): ");
            ligada = tec.nextLine();
            if (ligada.equalsIgnoreCase("nao")) {
                contDesl++;
                continue;
            }
            System.out.println("Informe o numero do canal que estava ligado: ");
            canais = tec.nextInt();
            if (canais != 4 && canais != 7 && canais != 12) {
                contDesl++;
                continue;
            }
            System.out.println("Informe a quantidade de pessoas que estavam assistindo esse canal: ");
            pessoas = tec.nextInt();
            somaTo += pessoas;
            switch (canais) {
                case 4:
                    soma4 += pessoas;
                    break;
                case 7:
                    soma7 += pessoas;
                    break;
                case 12:
                    soma12 += pessoas;
                    break;
            }
        } while (contVisitas != 100);
        if (soma4 > soma7 && soma4 > soma12) {
            maisAssis = "canal 4";
        } else if (soma7 > soma12)
            maisAssis = "canal 7";
        else
            maisAssis = "canal 12";
        casasAssi = contVisitas - contDesl;
        percentual4 = soma4 * 100.0 / somaTo;
        percentual7 = soma7 * 100.0 / somaTo;
        percentual12 = soma12 * 100.0 / somaTo;
        media = (float) somaTo / casasAssi;
        System.out.println("Audiencia do canal 4: " + soma4 + "\n" +
                "Audiencia do canal 7: " + soma7 + "\n" +
                "Audiencia do canal 12: " + soma12 + "\n" +
                "Porcentagem de audiencia do canal 4: " + percentual4 + "%" + "\n" +
                "Porcentagem de audiencia do canal 7: " + percentual7 + "%" + "\n" +
                "Porcentagem de audiencia do canal 12: " + percentual12 + "%" + "\n" +
                "Canal mais assitido: " + maisAssis + "\n" +
                "Media de pessoas que estavam assistindo TV: " + media);
        tec.close();
    }
}