package org.example.view;

import java.util.Scanner;

import org.example.model.*;

public class View {

    public static Scanner input = new Scanner(System.in);

    public int menuPrincipal(){

        System.out.println("||===========================================================||");
        System.out.println("||                    Logistica de Entregas                  ||");
        System.out.println("||===========================================================||");
        System.out.println("|| 1. Cadastrar Maquina                                      ||");
        System.out.println("|| 2. Cadastrar Tecnico                                      ||");
        System.out.println("|| 3. Cadastrar Peça                                         ||");
        System.out.println("|| 4. Criar Ordem de Manutenção                              ||");
        System.out.println("|| 5. Associar Peças a Ordem                                 ||");
        System.out.println("|| 6. Executar Manutenção                                    ||");
        System.out.println("||                                                           ||");
        System.out.println("||                                                 0. Sair   ||");
        System.out.println("||===========================================================||");

        int opcao = input.nextInt();
        input.nextLine();

        return opcao;
    }

    public Maquina cadastrarMaquina (){

        System.out.println("||===========================================================||");
        System.out.println("|| - Digite o nome da Maquina:                               ||");
        System.out.print("|| - ");
        String nome = input.nextLine();

        System.out.println("|| - Digite o CPF do Cliente:                                ||");
        System.out.print("|| - ");
        String cpf = input.nextLine();

        System.out.println("|| - Digite o endereco do Cliente:                           ||");
        System.out.print("|| - ");
        String endereco = input.nextLine();

        System.out.println("|| - Digite o cidade do Cliente:                             ||");
        System.out.print("|| - ");
        String cidade = input.nextLine();

        System.out.println("|| - Digite o Estado do Cliente:                             ||");
        System.out.print("|| - ");
        String estado = input.nextLine();
        System.out.println("||===========================================================||");

        cliente = new Cliente(nome , cpf , endereco, cidade, estado);

        return cliente;
    }





}
