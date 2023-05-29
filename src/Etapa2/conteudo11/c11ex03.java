package Etapa2.conteudo11;
import java.util.Scanner;
public class c11ex03 {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int dia,pts,cont=0;
        double multa1=42,multa2=108,multa3=479,soma=0;
        String placa;
        System.out.println("Para encerrar, digite 99 em dia.");
        System.out.println("Informe o dia da multa: ");
        dia=tec.nextInt();
        while (dia!=99){
            tec.nextLine();
            System.out.println("Informe a placa do veiculo: ");
            placa=tec.nextLine();
            System.out.println("Informe a quantidade de pontos do motorista: ");
            pts=tec.nextInt();
            switch (pts){
                case 3:
                    System.out.println("Veiculo de placa "+placa+" tem multa de: R$"+multa1);
                    soma+=multa1;
                    break;
                case 5:
                    System.out.println("Veiculo de placa "+placa+" tem multa de: R$"+multa2);
                    soma+=multa2;
                    break;
                case 8:
                    System.out.println("Veiculo de placa "+placa+" tem multa de: R$"+multa3);
                    if (dia<=15)
                        cont++;
                    soma+=multa3;
                    break;
            }
            System.out.println("Informe o dia da multa: ");
            dia=tec.nextInt();
        }
        System.out.println("Multas com pontuacao 8 na primeira quinzena do mes: "+cont+"\n" +
                "Valor total arrecadado com multas: "+soma);
        tec.close();
    }
}
