package Etapa2.conteudo8;
public class c08ex28 {
    public static void main(String[] args) {
        int n1, n2, n3, num, soma = 0,cont=0,media;
        for (int aux = 1; aux <= 1000; aux++) {
            n1 = aux;
            n2 = aux + 1;
            n3 = aux + 2;
            num = n1 * n2 * n3;
            if (num <= 1000) {
                System.out.print(num+", ");
                soma += num;
                cont++;
            }
        }
        media=soma/cont;
        System.out.println("Media: "+media);
    }
}
