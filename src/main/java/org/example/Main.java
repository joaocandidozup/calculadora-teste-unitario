package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(nomeDaAplicacao());
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        menu();

        int operacao = -1;
        while (operacao != 0) {
            System.out.print(menu());
            System.out.println("Digite uma opção:");
            operacao = entrada.nextInt();

            String resultado = calcular(numero1, numero2, operacao);
            System.out.println(resultado);
        }
    }

    public static String calcular(double numero1, double numero2, int operacao) {
        if (operacao == 1) {
            return String.format("O resultado de %.1f + %.1f = %.1f", numero1, numero2, (numero1 + numero2));
        } else if (operacao == 2) {
            return String.format("O resultado de %.1f - %.1f = %.1f", numero1, numero2, (numero1 - numero2));
        } else if (operacao == 3) {
            return String.format("O resultado de %.1f x %.1f = %.1f", numero1, numero2, (numero1 * numero2));
        } else if (operacao == 4) {
            if (numero2 != 0) {
                return String.format("O resultado de %.1f / %.1f = %.1f", numero1, numero2, (numero1 / numero2));
            } else {
                return String.format("O resultado de %.1f / %.1f é uma operação matemática indefinida!!!", numero1, numero2);
            }
        } else if (operacao == 0) {
            return "OK SAINDO DA APLICAÇÃO ................";
        } else {
            return "Operação inválida!!!";
        }
    }
    public static String menu(){
        String menu = """
                \nOperações:
                1 - Soma
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                0 - Sair
                """;
        return menu;
    }
    public static String nomeDaAplicacao(){
        String nome = "########## Calculadora do João ##########";
        return nome;
    }

}