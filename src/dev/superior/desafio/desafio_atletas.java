package dev.superior.desafio;

import java.util.Locale;
import java.util.Scanner;

public class desafio_atletas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        String sexo, nome, atletaAlto=" ";
        double peso, altura,contM = 0, contF = 0,pHomens = 0,totalPeso = 0, pesomedio = 0,alturaFem, altMulheres = 0, alturaAnt, totalAltura = 0;
        int i, n;

        alturaAnt = -1;

        System.out.print("Qual a quantidade de atletas: ");
        n = sc.nextInt();

        for ( i = 0; i < n; i++){
            System.out.printf("Digite os dados do atleta numero: %d\n", i + 1);
            System.out.print("Nome: ");
            nome = sc.next();
            System.out.print("Sexo: ");
            sexo = sc.next();
            while (!sexo.equals("F")  && !sexo.equals("M")){
                System.out.print("Valor Inválido! Favor Digitar F ou M : ");
                sexo = sc.next();
            }
            System.out.print("Altura: ");
            altura = sc.nextDouble();
            while (altura <= 0){
                System.out.print("Valor Inválido! Favor Digitar um valor positivo: ");
                altura = sc.nextDouble();
            }
            if (altura > alturaAnt){
                alturaAnt = altura;
                atletaAlto = nome;
            }
            System.out.print("Peso: ");
            peso = sc.nextDouble();
            while (peso <= 0){
                System.out.print("Valor Inválido! Favor Digitar um valor positivo: ");
                peso = sc.nextDouble();
            }

            if (sexo.equals("F")){
                contF = contF + 1;
                alturaFem = altura;
                totalAltura  = totalAltura + alturaFem;
                altMulheres = totalAltura / contF;
            }

            if (sexo.equals("M")) {
                contM = contM + 1;
                pHomens = contM / n * 100;
            }

            totalPeso = totalPeso + peso;
        }

        pesomedio  = totalPeso / n;

        System.out.println();
        System.out.println("RELATORIO:");
        System.out.println();
        System.out.printf("Peso Médio dos Atletas: %.2f\n" ,pesomedio);
        System.out.println("Atleta mais alto: "+ atletaAlto);
        System.out.printf("Percentagem de Homens: %.2f%%\n", pHomens);
        if (altMulheres > 0) {
            System.out.println("Altura Média das Mulheres: "+    altMulheres);
        }else{
            System.out.println("Não há Mulheres Cadastradas");
        }
    }
}
