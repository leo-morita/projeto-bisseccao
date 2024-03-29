package br.com.unifil.bisseccao.teste;

import br.com.unifil.bisseccao.modelo.Bisseccao;

import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Bisseccao bisseccao = new Bisseccao();
        Scanner teclado = new Scanner(System.in);
//        List<Float> resultadosDoX = new ArrayList<>();
//        List<Float> resultadosCriterioParada = new ArrayList<>();
        List<Integer> intervaloA;
        List<Integer> intervaloB;

        String funcao = "_x^5 + _xˆ4 + _x^3 + _x^2 + _x + _";
        System.out.println("Função: " + funcao);

        System.out.print("Digite o número _x^5: ");
        double n1 = teclado.nextDouble();
        funcao = String.format("%fx^5 + _xˆ4 + _x^3 + _x^2 + _x + _", n1);
        System.out.println(funcao);

        System.out.print("Digite o número _x^4: ");
        double n2 = teclado.nextDouble();
        funcao = String.format("%fx^5 + %fxˆ4 + _x^3 + _x^2 + _x + _", n1, n2);
        System.out.println(funcao);

        System.out.print("Digite o número _x^3: ");
        double n3 = teclado.nextDouble();
        funcao = String.format("%fx^5 + %fxˆ4 + %fx^3 + _x^2 + _x + _", n1, n2, n3);
        System.out.println(funcao);

        System.out.print("Digite o número _x^2: ");
        double n4 = teclado.nextDouble();
        funcao = String.format("%fx^5 + %fxˆ4 + %fx^3 + %fx^2 + _x + _", n1, n2, n3, n4);
        System.out.println(funcao);

        System.out.print("Digite o número _x: ");
        double n5 = teclado.nextDouble();
        funcao = String.format("%fx^5 + %fxˆ4 + %fx^3 + %fx^2 + %fx + _", n1, n2, n3, n4, n5);
        System.out.println(funcao);

        System.out.print("Digite o número _: ");
        double n6 = teclado.nextDouble();
        funcao = String.format("%fx^5 + %fxˆ4 + %fx^3 + %fx^2 + %fx + %f", n1, n2, n3, n4, n5, n6);
        System.out.println(funcao);

        System.out.print("£=10^");
        int expoente = teclado.nextInt();

        bisseccao.tabelaDeSinais(n1, n2, n3, n4, n5, n6);
        bisseccao.identificarIntervalos();

        intervaloA = bisseccao.getIntervaloA();
        intervaloB = bisseccao.getIntervaloB();

        System.out.println(intervaloA);
        System.out.println(intervaloB);

        bisseccao.exibirTabelaDeIteracoes(intervaloA, intervaloB, n1, n2, n3, n4, n5, n6, expoente);
    }

//    private static void exibirTabelaDeIteracoes(br.com.unifil.bisseccao.modelo.Bisseccao bisseccao, List<Integer> intervaloA,
//                                                List<Integer> intervaloB, double n1, double n2,
//                                                double n3, double n4, double n5, double n6, int expoente) {
//        List<Float> resultadosDoX;
//        List<Float> resultadosCriterioParada;
//        for (int aux = 0; aux < intervaloA.size(); aux++) {
//            System.out.format("Intervalo: [%d, %d]%n", intervaloA.get(aux), intervaloB.get(aux));
//            System.out.println(bisseccao.bisseccao(intervaloA.get(aux), intervaloB.get(aux), expoente));
//
//            resultadosDoX = bisseccao.getResultadosDoX();
//            resultadosCriterioParada = bisseccao.getResultadosCriterioParada();
//            for (int i = 0; i < resultadosDoX.size(); i++) {
//                int k = i + 1;
//                float x = resultadosDoX.get(i);
////                double fun = ((Math.pow(resultadosDoX.get(i), 3)) - (9 * resultadosDoX.get(i)) + 3);
//                double fun = ((n1 * Math.pow(x, 5)) + (n2 * Math.pow(x, 4)) + (n3 * Math.pow(x, 3)) +
//                        (n4 * Math.pow(x, 2)) + (n5 * Math.pow(x, 1)) + n6);
//                String saida = "K=" + k + ", x=" + x + ", f(x)=" + fun + ", criterio de parada=" +
//                        Math.abs(resultadosCriterioParada.get(i));
//                System.out.println(saida);
//            }
//
//            System.out.println("---------------------");
//        }
//    }

}
