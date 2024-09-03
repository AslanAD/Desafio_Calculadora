package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = "";
        int valor1 = 0;
        int valor2 = 0;
        int resultado = 0;


        while (!valor.equals("6")) {
            System.out.println("\n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Módulo\n6-Sair");
            System.out.println("Escolha uma operação:");
            valor = entrada.nextLine();

            switch (valor) {
                case "1":
                    System.out.println("Digite o primeiro valor:");
                    valor1 = entrada.nextInt();
                    System.out.println("Digite o segundo valor:");
                    valor2 = entrada.nextInt();
                    resultado = valor1 + valor2;
                    System.out.println("Resultado = " + resultado);
                    break;

                case "2":
                    System.out.println("Digite o primeiro valor:");
                    valor1 = entrada.nextInt();
                    System.out.println("Digite o segundo valor:");
                    valor2 = entrada.nextInt();
                    resultado = valor1 - valor2;
                    System.out.println("Resultado = " + resultado);
                    break;

                case "3":
                    System.out.println("Digite o primeiro valor:");
                    valor1 = entrada.nextInt();
                    System.out.println("Digite o segundo valor:");
                    valor2 = entrada.nextInt();
                    resultado = valor1 * valor2;
                    System.out.println("Resultado = " + resultado);
                    break;

                case "4":
                    System.out.println("Digite o primeiro valor:");
                    valor1 = entrada.nextInt();
                    System.out.println("Digite o segundo valor:");
                    valor2 = entrada.nextInt();
                    if (valor2 == 0) {
                        System.out.println("Não existe divisão por 0");
                    } else {
                        resultado = valor1 / valor2;
                        System.out.println("Resultado = " + resultado);
                    }
                    break;

                case "5":
                    System.out.println("Digite o primeiro valor:");
                    valor1 = entrada.nextInt();
                    System.out.println("Digite o segundo valor:");
                    valor2 = entrada.nextInt();
                    resultado = valor1 % valor2;
                    System.out.println("Resultado = " + resultado);
                    break;

                case "6":
                    System.out.println("Programa encerrado");
                    break;

                default:
                    System.out.println("Valor inválido!");
                    System.out.println("Digite um valor válido!");
                    break;
            }

        }

        entrada.close();
    }
}
