package br.com.app;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int valorMaximo = 10;
        int valorSorteado = new Random().nextInt(valorMaximo);
        int valorEscolhido;
        int contador = 0;

        System.out.print(gerarDesafio(false, null));

        do {
            contador++;
            valorEscolhido = sc.nextInt();
            if (valorEscolhido == valorSorteado) {
                System.out.println("\nParabéns, você acertou na tentativa de número " + contador + ".");
                break;
            } else if (valorEscolhido > valorSorteado) {
                System.out.printf(gerarDesafio(true, "maior"));
            } else {
                System.out.printf(gerarDesafio(true, "menor"));
            }
        } while (valorSorteado != valorEscolhido);
    }

    public static String gerarDesafio(boolean redoing, String result) {
        StringBuilder sb = new StringBuilder();
        if (!redoing) {
            sb.append("Desafio #1");
            sb.append("\nEscolha um número entre 1 e 10");
            sb.append("\nDigite: ");
        } else {
            sb.append("\nO valor informado é " + result + " que o valor esperado!");
            sb.append("\nVamos lá, tente novamente!");
            sb.append("\nValor: ");
        }
        return sb.toString();
    }

}