package Etapa1.Parte2;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class c04ex05 {
    public static void main(String[] args) {
        String nome, cpf, iden, nomEmpresa;
        long titEleitor, cartMoto;
        double salario;
        Scanner arquivo=new Scanner(c04ex05.class.getResourceAsStream("dados.txt"));
        nome=arquivo.nextLine();
        nomEmpresa=arquivo.nextLine();
        cpf=arquivo.nextLine();
        iden=arquivo.nextLine();
        titEleitor=arquivo.nextLong();
        cartMoto=arquivo.nextLong();
        salario=arquivo.nextDouble();
        JOptionPane.showMessageDialog(null,
                nome+"\nDocumentos:"+
                        "\nCPF:............................................."+cpf+
                        "\nC.I:..............................................."+iden+
                        "\nT�tulo de Eleitor:..........................."+titEleitor+
                        "\nCarteira de motorista:..................."+cartMoto+
                        "\n"+
                        "\nEmpresa: "+nomEmpresa+
                        "\nSalario: R$"+salario,
                "FICHA FUNCIONAL DE: ",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
