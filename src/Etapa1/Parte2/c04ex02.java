package Etapa1.Parte2;
import java.util.Scanner;
public class c04ex02 {
    public static void main(String[] args) {
        String nome, cpf, iden, nomEmpresa;
        long titEleitor, cartMoto;
        double salario;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Qual o seu nome completo? ");
        nome = teclado.nextLine();
        System.out.print("Qual o número do seu CPF? ");
        cpf  = teclado.nextLine();
        System.out.print("Qual o número da sua identidade? ");
        iden=teclado.nextLine();
        System.out.print("Qual o nome da empresa que voce trabalha? ");
        nomEmpresa=teclado.nextLine();
        System.out.print("Qual o número do seu Título de Eleitor? ");
        titEleitor=teclado.nextLong();
        System.out.print("Qual o número da sua carteira de Motorista? ");
        cartMoto=teclado.nextLong();
        System.out.print("Qual o valor do seu sálario? ");
        salario=teclado.nextDouble();
        System.out.println("FICHA FUNCIONAL DE: "+nome);
        System.out.println();
        System.out.println("Documentos:");
        System.out.println("CPF ............................................."+cpf);
        System.out.println("C.I. ............................................"+iden);
        System.out.println("Título de eleitor .............................."+titEleitor);
        System.out.println("Carteira de Motorista ..........................."+cartMoto);
        System.out.println();
        System.out.println("Empresa: "+nomEmpresa);
        System.out.println("Salário: R$ "+salario);
        teclado.close();
    }
}
