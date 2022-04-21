package com.br.projetoRelatorio;

import java.util.Scanner;

/*EStou criando esse projeto próprio para somar os relatórios diários que faço no meu trabalho.
O relatório tem que conter os principais pontos:
            cadastro
-Nome da pessoa que comprou;
-Inserir os valores recebidos em dinheiro:em produto ou  dívida;

            Operações matemáticas
-Somar todos os valores de entrada de dinheiro
-Subtrair o valor dado para passar troco e subtrair a saída de dinheiro das despesas;


            imprimir na tela
-Soma total de recebidos;
-Total da despesa diária;
-Valor total recebido para troco;
* */
public class somaRelatorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double compraProd = 0, pagDivida = 0, somaValRecebidos = 0,somaDespesas = 0, valorTroco, valorDespesas, calculoRelatorio = 0, relComTroco = 0;
        int cont = 0,cont2 = 1, prox = 1, cont1 = 0,cont3 = 1, prox2 = 1;
        char nome, continua, continua2, Iddespesa;

        while(cont < prox){
            System.out.println("Digite o nome do " + cont2++ + "° Cliente: ");
            nome = scan.next().charAt(0);

            System.out.println("Digite o valor do produto comprado: [caso for Dívida paga digite \"0\" zero]");
            compraProd = scan.nextDouble();

            System.out.println("Digite o valor pago da dívida: [caso for apenas Compra digite \"0\" zero]");
            pagDivida = scan.nextDouble();

            System.out.println("Quer continuar cadastrando clientes? responda [S] (para sim ou [N] para não)");
            continua = scan.next().charAt(0);

            System.out.println("===============================================================================");

            if ((compraProd > pagDivida) || (pagDivida > compraProd)){

                somaValRecebidos = somaValRecebidos + pagDivida;
                somaValRecebidos = somaValRecebidos + compraProd;
            }

            if (continua == 'S'){

                prox = prox + 1;

            }else if (continua == 'N'){

                break;
            }



            cont++;
        }
       do{

            System.out.println("Digite um nome/identificação da " + cont3++ + "° Despesa: ");
            nome = scan.next().charAt(0);

            System.out.println("Digite o valor da despesa: ");
            valorDespesas = scan.nextDouble();

            System.out.println("Quer continuar cadastrando despesas? responda [S] (para sim ou [N] para não)");
            continua2 = scan.next().charAt(0);

           System.out.println("===============================================================================");

            somaDespesas = somaDespesas + valorDespesas;

            if (continua2 == 'S'){

                prox2 = prox2 + 1;

            }else if (continua2 == 'N'){
                break;
            }


            cont++;

        }while(cont2 < prox2);

        System.out.println("Digite o valor recebido de troco: ");
        valorTroco = scan.nextDouble();

        calculoRelatorio = (somaValRecebidos) - (somaDespesas);
        relComTroco = valorTroco + calculoRelatorio;


        System.out.println("Total de valores recebidos: R$" + somaValRecebidos + " reais.");
        System.out.println("Total em despesas: R$" + somaDespesas + " reais.");
        System.out.println("Valor em dinheiro do relatório: R$" +  calculoRelatorio + " reais." + " + R$" + valorTroco + " reais de troco.");
        System.out.println("Valor total com troco: R$" + relComTroco + " reais.");
    }
}
