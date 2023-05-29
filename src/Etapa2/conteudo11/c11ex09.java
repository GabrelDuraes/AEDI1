package Etapa2.conteudo11;
import java.util.Scanner;
public class c11ex09 {
    public static void main(String[] args) {
        String nome, setorString, nomeVelho = "", nomeNovo = "";
        int rf,admissao,admissaoMe=0,admissaoMa=0, ano, setor, contGe = 0, contAdm = 0, contPes = 0, contObras = 0, cont10 = 0, cont = 0, anoVelho = 0, anoNovo = 0;
        Scanner tec = new Scanner(System.in);
        System.out.println("Para encerrar, digite Fim em nome.");
        do {
            System.out.println("Informe o nome do funcionario: ");
            nome = tec.nextLine();
            if (nome.equalsIgnoreCase("fim")) {
                System.out.println("Fim do programa.");
                break;
            }
            System.out.println("Informe o resgistro funcional de " + nome + ":");
            rf = tec.nextInt();
            cont++;
            ano = rf / 10000;
            setor = rf % 10000 / 1000;
            admissao=rf%1000;
            if (ano < 10 || ano > 14) {
                System.out.println("REGISTRO INVALIDO.");
                tec.nextLine();
                continue;
            }
            switch (setor) {
                case 1:
                    contGe++;
                    break;
                case 2:
                    contAdm++;
                    if (ano == 10)
                        cont10++;
                    break;
                case 3:
                    contPes++;
                    break;
                case 4:
                    contObras++;
                    break;
                default:
                    System.out.println("REGISTRO INVALIDO");
                    break;
            }
            if (cont == 1 || ano < anoVelho && ano > 10||admissao<admissaoMe) {
                    nomeVelho = nome;
                    anoVelho = ano;
                    admissaoMe=admissao;
            }
            if (cont == 1 || ano > anoNovo && ano < 14||admissao>admissaoMa) {
                    nomeNovo = nome;
                    anoNovo = ano;
                    admissaoMa=admissao;
            }
            tec.nextLine();
        } while (!(nome.equalsIgnoreCase("Fim")));
        if (contGe > contAdm && contGe > contObras && contGe > contPes)
            setorString = "Gerencia.";
        else if (contAdm > contObras && contAdm > contPes)
            setorString = "Administracao.";
        else if (contObras > contPes)
            setorString = "Obras.";
        else
            setorString = "Pesquisa.";
        System.out.println("Funcionarios no setor de Gerencia: " + contGe + "\n" +
                "Funcionarios no setor de Administracao: " + contAdm + "\n" +
                "Funcionarios no setor de Pesquisa: " + contPes + "\n" +
                "Funcionario no setor de Obras: " + contObras + "\n" +
                "Funcionarios que foram admitidos em 2010 e trabalham na Administracao: " + cont10 + "\n" +
                "Setor com maior numero de funcionarios alocados: " + setorString + "\n" +
                "Primeiro funcionario admitido na empresa: " + nomeVelho + "\n" +
                "Ultimo funcionario admitido na empresa: " + nomeNovo);
        tec.close();
    }
}