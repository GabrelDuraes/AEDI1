package Etapa2.conteudo8;
import javax.swing.JOptionPane;
public class c08ex11 {
    public static void main(String[] args) {
        String nome, idadestr, salariostr, nomeSalario = "";
        double salario, salarioMaior = 0, salarioMAHomem = 0, salarioMEHomem = 0, diferenca;
        String[] botoesSex = {"Homem", "Mulher"}, botoesEstCivil = {"Casado", "Solteiro", "Outros"}, botoesOlho = {"Azul", "Castanho", "Preto", "Outros"}, botaoCabelo = {"Loiro", "Preto", "Castanho", "Ruivos"}, botaoEscola = {"Analfabeto", "Ensino Fundamental", "Ensino medio", "Superior"};
        int contMulher = 0, idade;
        for (int aux = 1; aux <= 2; aux++) {
            nome = JOptionPane.showInputDialog(null, "Informe o seu nome:", "Dados", JOptionPane.QUESTION_MESSAGE);
            idadestr = JOptionPane.showInputDialog(null, "Informe a sua idade:", "Dados", JOptionPane.QUESTION_MESSAGE);
            int sex = JOptionPane.showOptionDialog(null, "Informe o seu sexo:", "Dados", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botoesSex, "Homem");
            int estadoCivil = JOptionPane.showOptionDialog(null, "Informe o seu estado civil:", "Dados", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botoesEstCivil, "Casado");
            int corOlhos = JOptionPane.showOptionDialog(null, "Informe a cor dos seus olhos:", "Dados", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botoesOlho, "Azul");
            int corCabelo = JOptionPane.showOptionDialog(null, "Informe a cor do seu cabelo:", "Dados", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botaoCabelo, "Loiro");
            salariostr = JOptionPane.showInputDialog(null, "Informe o valor do seu salario em R$: ", "Dados", JOptionPane.QUESTION_MESSAGE);
            int escolaridade = JOptionPane.showOptionDialog(null, "Informe sua escolaridade:", "Dados", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, null, botaoEscola, "Analfabeto");
            idade = Integer.valueOf(idadestr);
            salario = Double.valueOf(salariostr);
            if (corCabelo == 0 && corOlhos == 0 && idade > 18 && idade < 25 && estadoCivil == 1 && salario > 10000 && escolaridade == 4)
                contMulher++;
            if (aux == 1 || salario > salarioMaior) {
                salarioMaior = salario;
                nomeSalario = nome;
            }
            if (sex == 0) {
                if (aux==1||salario > salarioMAHomem)
                    salarioMAHomem = salario;
                else if (aux==1||salario < salarioMEHomem)
                    salarioMEHomem = salario;
            }
        }
        diferenca = salarioMAHomem - salarioMEHomem;
        JOptionPane.showMessageDialog(null,
                "Mulheres loiras, de olhos azuis, com idade entre 18 e 25 anos, solteiras, salario maior que R$10.000,00 e curso superior completo: " + contMulher + "\n" +
                        "Pessoa com maior salario: " + nomeSalario + "\n" +
                        "Diferenca entre o maior e menor salario dos homens: " + diferenca,
                "Dados",
                JOptionPane.INFORMATION_MESSAGE);
    }
}