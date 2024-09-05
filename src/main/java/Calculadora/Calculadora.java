package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String valor = "";
        double valor1 = 0;
        double valor2 = 0;
        double resultado = 0;
        boolean num = false;


        while (!valor.equals("6")) {
            System.out.println("\n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Módulo\n6-Sair");
            System.out.println("Escolha uma operação:");
            valor = entrada.next();

            switch (valor) {
                case "1":
                    System.out.println("Digite um valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor1 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    System.out.println("Digite outro valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor2 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    resultado = valor1 + valor2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case "2":
                    System.out.println("Digite um valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor1 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    System.out.println("Digite outro valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor2 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    resultado = valor1 - valor2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case "3":
                    System.out.println("Digite um valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor1 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    System.out.println("Digite outro valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor2 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    resultado = valor1 * valor2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case "4":
                    System.out.println("Digite um valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor1 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    System.out.println("Digite outro valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor2 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    if (valor2 == 0) {
                        System.out.println("Divisão inválida.");
                    } else
                        resultado = valor1 / valor2;
                    System.out.println("Resultado = " + resultado);
                    break;
                case "5":
                    System.out.println("Digite um valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor1 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    System.out.println("Digite outro valor: ");
                    while (!num) {
                        if (!entrada.hasNextDouble()) {
                            System.out.println("Digite um número válido.");
                            entrada.next().replace(",",".");
                        } else {
                            valor2 = entrada.nextDouble();
                            entrada.nextLine().replace(",",".");
                            break;
                        }
                    }
                    if (valor2 == 0) {
                        System.out.println("Divisão inválida.");
                    } else
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
