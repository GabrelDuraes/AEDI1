package Etapa1.Teste;
import java.text.DecimalFormat;
public class FormatandoNumeros {
    public static void main(String[] args) {
    double valor = 12005.867;
    String valorFormatado;
    valorFormatado = new DecimalFormat("#,##0.00").format(valor);
    System.out.println(valorFormatado);
    // Imprimir�: 12.005,
    valorFormatado = new DecimalFormat("R$ #,##0.00").format(valor);
    System.out.println(valorFormatado);
    // Imprimir�: R$ 12.005,
    valorFormatado = new DecimalFormat("#,##0").format(valor);
    System.out.println(valorFormatado);
    // Imprimir�: 12.006
}
}