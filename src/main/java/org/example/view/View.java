package org.example.view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.example.model.*;

public class View {

    public static Scanner input = new Scanner(System.in);
    Maquina maquina = new Maquina();
    Tecnico tecnico = new Tecnico();
    Peca peca = new Peca();
    OrdemManutencao ordemManutencao = new OrdemManutencao();

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

        System.out.println("|| - Digite o setor da Maquina:                              ||");
        System.out.print("|| - ");
        String setor = input.nextLine();

        System.out.println("|| - Digite o status da Maquina:                             ||");
        System.out.print("|| - ");
        String status = input.nextLine();

        System.out.println("||===========================================================||");

       maquina = new Maquina(nome , setor, status);

        return maquina;
    }

    public Tecnico cadastrarTecnico (){

        System.out.println("||===========================================================||");
        System.out.println("|| - Digite o nome:                               ||");
        System.out.print("|| - ");
        String nome = input.nextLine();

        System.out.println("|| - Digite a Especialidade:                                 ||");
        System.out.print("|| - ");
        String especialidade = input.nextLine();



        System.out.println("||===========================================================||");

        tecnico = new Tecnico(nome , especialidade);

        return tecnico;
    }


    public Peca cadastrarPeca (){

        System.out.println("||===========================================================||");
        System.out.println("|| - Digite o nome:                                          ||");
        System.out.print("|| - ");
        String nome = input.nextLine();

        System.out.println("|| - Digite o estoque:                                       ||");
        System.out.print("|| - ");
        double estoque = input.nextDouble();



        System.out.println("||===========================================================||");

        peca = new Peca(nome , estoque);

        return peca;
    }

    public OrdemManutencao cadastrarOrdemManutencao (){

        System.out.println("||===========================================================||");
        System.out.println("|| - Digite o id da Maquina:                               ||");
        System.out.print("|| - ");
        int idMaquina = input.nextInt();

        System.out.println("||===========================================================||");
        System.out.println("|| - Digite o id do Tecnico:                               ||");
        System.out.print("|| - ");
        int idTecnico = input.nextInt();

        System.out.println("|| - Digite a data da Solicitação(formato (dd/mm/yyyy)):                              ||");
        System.out.print("|| - ");
        String dataText = input.nextLine();



        try{
            SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
            Date dateUtil = formato.parse(dataText);

            Date dataSql = new Date(dateUtil.getTime());

        }catch (Exception e){
            System.err.println("|| ####################  Formato Errado!  ################## ||");
        }

            System.out.println("|| - Digite o status da Maquina:                             ||");
        System.out.print("|| - ");
        String status = input.nextLine();

        System.out.println("||===========================================================||");

        ordemManutencao = new OrdemManutencao();

        return ordemManutencao;
    }

}
