package Etapa1.Extras;
import java.util.Scanner;
public class Extras2c07 {
    public static void main(String[] args) {
        String tipoC,paga;
        double qtdCarne,conta,desconto,total;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Informe o tipo de carne que ira comprar? ");
        tipoC=teclado.nextLine();
        System.out.println("Informe quantos kilos de carne ira comprar: ");
        qtdCarne=teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Voce pagara a compra pelo cartao Tabajara? ");
        paga=teclado.nextLine();
        conta=0;
        desconto=0;
        if (tipoC.equalsIgnoreCase("File duplo")){
            if (qtdCarne<=5) {
                conta = 4.90 * qtdCarne;
            }else {
                conta = 5.80 * qtdCarne;
            }} else if (tipoC.equalsIgnoreCase("Alcatra")) {
            if (qtdCarne<=5) {
                conta = 5.90 * qtdCarne;
            }else {
                conta = 6.80 * qtdCarne;
            }} else if (tipoC.equalsIgnoreCase("Picanha")) {
            if (qtdCarne<=5) {
                conta = 6.90 * qtdCarne;
            }else {
                conta = 7.80 * qtdCarne;
            }}
        if (paga.equalsIgnoreCase("sim")){
            desconto=conta*5/100;}
        else if (paga.equalsIgnoreCase("nao")){
            desconto=0;}
        total=conta-desconto;
        System.out.println("========Cupom Fiscal========"+"\n"+
                "Quantidade de carne: "+qtdCarne+"--"+tipoC+"\n" +
                "Preco sem desconto: R$"+conta+" Desconto: R$"+desconto+"\n" +
                "Preco total: R$"+total);
        teclado.close();
    }
}
