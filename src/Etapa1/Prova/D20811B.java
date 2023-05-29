//Nome: Gabriel da Silva Durães.
package Etapa1.Prova;
import javax.swing.JOptionPane;
public class D20811B {
    public static void main(String[] args) {
        String cand1, cand2, cand3, votosCand1, votosCand2, votosCand3, nulos, brancos;
        int votos1,votos2,votos3,nulos1,brancos1,naovotos;
        cand1=JOptionPane.showInputDialog(null, "Informe o nome do primeiro candidato: ", "Eleicao", JOptionPane.QUESTION_MESSAGE);
        votosCand1=JOptionPane.showInputDialog(null, "Informe a quantidade de votos do candidato 1: ", "Eleicao", JOptionPane.QUESTION_MESSAGE);
        cand2=JOptionPane.showInputDialog(null, "Informe o nome do candidato 2: ", "Eleicao", JOptionPane.QUESTION_MESSAGE);
        votosCand2=JOptionPane.showInputDialog(null, "Informe a quantidade de votos do candidato 2: ", "Eleicao", JOptionPane.QUESTION_MESSAGE);
        cand3=JOptionPane.showInputDialog(null, "Informe o nome do candidato 3: ", "Eleicao", JOptionPane.QUESTION_MESSAGE);
        votosCand3=JOptionPane.showInputDialog(null, "Informe a quantidade de votos do candidato 3: ", "Eleicao", JOptionPane.QUESTION_MESSAGE);
        nulos=JOptionPane.showInputDialog(null, "Informe a quantidade de votos nulos: ", "Eleicao", JOptionPane.QUESTION_MESSAGE);
        brancos=JOptionPane.showInputDialog(null, "Informe a quantidade de votos em branco: ", "Eleicao", JOptionPane.QUESTION_MESSAGE);
        votos1=Integer.valueOf(votosCand1);
        votos2=Integer.valueOf(votosCand2);
        votos3=Integer.valueOf(votosCand3);
        nulos1=Integer.valueOf(nulos);
        brancos1=Integer.valueOf(brancos);
        naovotos=nulos1+brancos1;
        if (votos1<naovotos&&votos2<naovotos&&votos3<naovotos)
            System.out.println("Eleicao Invalida");
        if (votos1>votos2&&votos1>votos3)
            JOptionPane.showMessageDialog(null,
                    "Vencedor: "+cand1,
                    "Eleicao",
                    JOptionPane.INFORMATION_MESSAGE);
        else if (votos2>votos1&&votos2>votos3)
            JOptionPane.showMessageDialog(null,
                    "Vencedor: "+cand2,
                    "Eleicao",
                    JOptionPane.INFORMATION_MESSAGE);
        else if (votos3>votos1&&votos3>votos2)
            JOptionPane.showMessageDialog(null,
                    "Vencedor: "+cand3,
                    "Eleicao",
                    JOptionPane.INFORMATION_MESSAGE);
    }
}
