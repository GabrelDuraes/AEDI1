package Etapa1.Parte2;
import javax.swing.JOptionPane;
public class c04ex04 {
    public static void main(String[] args) {
        String primNome;
        String segNome;
        String terNome;
        String idade;
        primNome=JOptionPane.showInputDialog(null,
                "Qual o seu primeiro nome? ",
                "Dados",
                JOptionPane.QUESTION_MESSAGE);
        segNome=JOptionPane.showInputDialog(null,
                "Qual o seu segundo nome? ",
                "Dados",
                JOptionPane.QUESTION_MESSAGE);
        terNome=JOptionPane.showInputDialog(null,
                "Qual o seu terceiro nome? ",
                "Dados",
                JOptionPane.QUESTION_MESSAGE);
        idade=JOptionPane.showInputDialog(null,
                "Quantos anos voce tem? ",
                "Dados",
                JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                terNome+", "+primNome+segNome+"\nIdade: "+idade+" anos.",
                "Dados",
                JOptionPane.INFORMATION_MESSAGE);
    }
}