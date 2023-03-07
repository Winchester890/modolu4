package models;

import models.Carro;

import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o número do chassi? ");
        int chassi = scanner.nextInt();
        System.out.print("Qual é o tipo de motor do carro? ");
        String motor = scanner.nextLine();
        System.out.print("Qual é a cor do carro? ");
        String cor = scanner.nextLine();
        System.out.print("O carro tem ar condicionado? " );
        String arCondicionado = scanner.nextLine();
        System.out.println("Qual é o ano de fabricação do carro? ");
        int ano = scanner.nextInt();
        System.out.print("Quantos litros o tanque do carro suporta? ");
        int combustivel = scanner.nextInt();
        System.out.print("Quantos pneus o carro tem? ");
        int quantidadePneus = scanner.nextInt();
        System.out.print("Quantas portas o carro tem? ");
        int quantidadePortas = scanner.nextInt();
        System.out.print("Quantas janelas o carro tem? ");
        int quantidadeJanelas = scanner.nextInt();
        System.out.print("Quantos faróis o carro tem? ");
        int quantidadeFarois = scanner.nextInt();

        Carro pecasCarro = new Carro();
        pecasCarro.setChassi(chassi);
        pecasCarro.setMotor(motor);
        pecasCarro.setCor(cor);
        pecasCarro.setCombustivel(combustivel);
        pecasCarro.setQuantidadePneus(quantidadePneus);
        pecasCarro.setQuantidadePortas(quantidadePortas);
        pecasCarro.setQuantidadeJanelas(quantidadeJanelas);
        pecasCarro.setQuantidadeFarois(quantidadeFarois);
        pecasCarro.setArCondicionado(arCondicionado);
        pecasCarro.setAno(ano);

        System.out.println(" ");
        System.out.println("---- Infos do carro ----");
        System.out.println("Número do chassi: " + pecasCarro.getChassi());
        System.out.println("Tipo de motor: " + pecasCarro.getMotor());
        System.out.println("Cor: " + pecasCarro.getCor());
        System.out.println("Litros do tanque de combustível: " + pecasCarro.getCombustivel());
        System.out.println("Quantidade de pneus: " + pecasCarro.getQuantidadePneus());
        System.out.println("Quantidade de portas: " + pecasCarro.getQuantidadePortas());
        System.out.println("Quantidade de janelas: " + pecasCarro.getQuantidadeJanelas());
        System.out.println("Quantidade de faróis: " + pecasCarro.getQuantidadeFarois());
        System.out.println("Ano de fabricação: " + pecasCarro.getAno());
        System.out.println("Ar condicionado: " + pecasCarro.getArCondicionado());

    }
}
