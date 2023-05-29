//Gabriel da Silva Durães
package Etapa2.Prova2;

public class D20811B {
    public static void main(String[] args) {
        double den, num, serie = 0;
        int cont = 0;
        do {
            cont++;
            num = Math.pow(3 + cont, 2) + Math.sqrt(7 * cont - 3);
            den = Math.pow(2 * cont - 1, 2 * cont);
            serie += num / den;
        } while (cont <= 20);
        serie = (10 * serie) - 5;
        System.out.println("Valor da serie: " + serie);
    }
}
