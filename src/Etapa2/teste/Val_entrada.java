package Etapa2.teste;
import java.util.Scanner;
public class Val_entrada {
    public static void main(String[] args) {
        String sexo;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Informe seu sexo " +
                    "(F-feminino, M-masculino): ");
            sexo = teclado.nextLine();
            if (!sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("M"))
                System.out.print("Código inválido! Informe novamente.");
        }while (!sexo.equalsIgnoreCase("F")&&!sexo.equalsIgnoreCase("M"));
    }
}
