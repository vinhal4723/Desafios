package arrays;

import java.util.Scanner;

public class DesafioA {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantas notas: ");
        int quantNotas = entrada.nextByte();

        double[] notas = new double[quantNotas];

        for (int i =0; i < notas.length; i++) {
            System.out.print("Informe a nota: ");
            notas[i] = entrada.nextDouble();
        }
        double total = 0;
        for (double nota: notas) {
            total += nota;
        }
        double media = total / notas.length;
        System.out.println("Media é " + media + " !");
    }
}
