package ATIVIDADE11;

import java.util.Scanner;

public class SistemasDeNota {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                double[] notas = new double[10];
                int quantidade = 0;
                int opcao = -1;

                while (opcao != 0) {

                    System.out.println("1 - Cadastrar notas");
                    System.out.println("2 - Listar notas");
                    System.out.println("3 - Calcular media");
                    System.out.println("4 - Maior e menor nota");
                    System.out.println("5 - Consultar nota por numero");
                    System.out.println("0 - Sair");
                    System.out.println("Escolha uma opcao: ");
                    opcao = sc.nextInt();

                    if (opcao == 1) {

                        System.out.println("Quantos alunos deseja cadastrar (1 a 10)? ");
                        quantidade = sc.nextInt();

                        if (quantidade < 1 || quantidade > 10) {
                            System.out.println("Quantidade invalida!");
                            quantidade = 0;
                        } else {
                            for (int i = 0; i < quantidade; i++) {
                                System.out.println("Nota do aluno " + (i + 1) + ": ");
                                notas[i] = sc.nextDouble();
                            }
                        }

                    } else if (opcao == 2) {

                        if (quantidade == 0) {
                            System.out.println("Nenhuma nota cadastrada ainda.");
                        } else {
                            for (int i = 0; i < quantidade; i++) {
                                System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
                            }
                        }

                    } else if (opcao == 3) {

                        if (quantidade == 0) {
                            System.out.println("Nenhuma nota cadastrada ainda.");
                        } else {
                            double soma = 0;
                            for (int i = 0; i < quantidade; i++) {
                                soma = soma + notas[i];
                            }
                            double media = soma / quantidade;
                            System.out.println("Media da turma: " + media);
                        }

                    } else if (opcao == 4) {

                        if (quantidade == 0) {
                            System.out.println("Nenhuma nota cadastrada ainda.");
                        } else {
                            double maior = notas[0];
                            double menor = notas[0];

                            for (int i = 0; i < quantidade; i++) {
                                if (notas[i] > maior) {
                                    maior = notas[i];
                                }
                                if (notas[i] < menor) {
                                    menor = notas[i];
                                }
                            }

                            System.out.println("Maior nota: " + maior);
                            System.out.println("Menor nota: " + menor);
                        }

                    } else if (opcao == 5) {

                        if (quantidade == 0) {
                            System.out.println("Nenhuma nota cadastrada ainda.");
                        } else {
                            System.out.println("Digite o numero do aluno: ");
                            int numero = sc.nextInt();

                            if (numero < 1 || numero > quantidade) {
                                System.out.println("Numero invalido!");
                            } else {
                                System.out.println("Nota do aluno " + numero + ": " + notas[numero - 1]);
                            }
                        }

                    } else if (opcao == 0) {
                        System.out.println("Saindo do programa...");

                    } else {
                        System.out.println("Opcao invalida!");
                    }
                }
            }
}
