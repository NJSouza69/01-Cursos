package br.com.dio.calculadora;

import java.sql.SQLOutput;
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o primeiro valor: ");
        b = scan.nextInt();5

        int somar = somar (a,b);
        int subtrair = subtrair (a,b);
        int multiplicar = multiplicar (a,b);
        double dividir = dividir (a,b);

        System.out.println("somar : " + somar);
        System.out.println("subt : " + subtrair);
        System.out.println("mult : " + multiplicar);
        System.out.println("divid : " + dividir);
    }

    public static int somar(int a ,int b) {
        return a + b;
    }
    public static int subtrair(int a ,int b) {
        return a - b;
    }
    public static int multiplicar(int a ,int b) {
        return a * b;
    }
    public static double dividir(int a ,int b) {
        return a / b;
    }

}
