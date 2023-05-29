package Etapa1.Parte4;
import java.util.Scanner;
public class c06ex04 {
    public static void main(String[] args) {
        String nome;
        double altura,peso,imc;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Qual o seu nome?");
        nome=teclado.nextLine();
        System.out.print("Qual a sua altura?");
        altura=teclado.nextDouble();
        System.out.print("Qual o seu peso?");
        peso=teclado.nextDouble();
        imc=peso/Math.pow(altura,2);
        if (imc<18){
            System.out.print("Nome: " + nome+"\nAltura: " + altura + "\nPeso: " + peso + "\nIMC: Pessoa esta desnutrida");
        }
        else{
            if (imc>=18&&imc<20){
                System.out.println("Nome: " + nome+"\nAltura: " + altura + "\nPeso: " + peso + "\nIMC: Pessoa esta abaixo do peso");
            }
            else{
                if(imc>=20&&imc<25){
                    System.out.println("Nome: " + nome+"\nAltura: " + altura + "\nPeso: " + peso + "\nIMC: Pessoa esta no peso ideal");
                }
                else{
                    if (imc>=25&&imc<27){
                        System.out.print("Nome: " + nome+"\nAltura: " + altura + "\nPeso: " + peso + "\nIMC:Pessoa esta acima do peso");
                    }
                    else
                        System.out.print("Nome: " + nome+"\nAltura: " + altura + "\nPeso: " + peso + "\nIMC: Pessoa esta obesa");
                }
            }
        }
        teclado.close();
    }
}