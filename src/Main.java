import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {

        //Crie um programa que receba dois valores do usuário
        //e exiba a o resultado de sua subtração;

        Scanner scr = new Scanner(System.in);

        int valor;
        int valor1;
        int subtracao;

        System.out.print("informe o valor\n");
        valor = scr.nextInt();

        System.out.print("informe o valor1\n");
        valor1 = scr.nextInt();

        subtracao = valor - valor1;

        System.out.print("resultado da subtração é\n");

        System.out.println(subtracao);



    }
}
