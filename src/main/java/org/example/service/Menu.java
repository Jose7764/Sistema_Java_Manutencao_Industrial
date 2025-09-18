package org.example.service;

import org.example.view.*;
import org.example.service.*;

import java.sql.SQLException;

public class Menu {

    View view = new View();
    Cadastrar cadastro = new Cadastrar();

    public int menuPrincipal() throws SQLException {
        int opcao = view.menuPrincipal();

        switch (opcao){
            case 1:
                cadastro.cadastrarMaquina();
                break;

            case 2:
                cadastro.cadastrarTecnico();
                break;

            case 3:
                cadastro.cadastrarPeca();
                break;
            case 0:
                System.out.println("||===========================================================||");
                System.out.println("||                    Sistema Enserrado!                     ||");
                System.out.println("||===========================================================||");
                break;
        }

        return opcao;
    }

}
