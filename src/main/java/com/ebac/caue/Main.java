package com.ebac.caue;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as quatro notas: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();
        double mediaFinal = calculaMedia(nota1, nota2, nota3, nota4);
        String resultado = verificaMedia(mediaFinal);
        System.out.println(resultado);
    }

    public static double calculaMedia(double nota1, double nota2, double nota3, double nota4) {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    // Não utilizei if, pois o 'SwitchCase' não suporta o tipo double
    public static String verificaMedia(double nota) {
        if (nota > 10 || nota < 0) {
            return "Nota inválida. Digite uma nota de 0 a 10";
        } else if (nota >= 7) {
            return "Aluno aprovado";
        } else if (nota >= 5) {
            return "Aluno de recuperação";
        } else {
            return "Aluno reprovado";
        }
    }
}