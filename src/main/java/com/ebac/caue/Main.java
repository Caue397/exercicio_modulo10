package com.ebac.caue;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        int nota = scanner.nextInt();
        String resultado = verificaNota(nota);
        System.out.println(resultado);
    }

    public static String verificaNota(int nota) {
        String resultado;
        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                resultado = "Aluno reprovado";
                break;
            case 5:
            case 6:
                resultado = "Aluno de recuperação";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                resultado = "Aluno aprovado";
                break;
            default:
                resultado = "Nota inválida. Digite um número de 0 a 10.";
        }
        return resultado;
    }
}