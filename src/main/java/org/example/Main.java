package org.example;

import org.example.service.*;

import java.sql.SQLException;

public class Main {

    static Menu menu = new Menu();

    public static void main(String[] args) throws SQLException {

        while(true){
           int opcao =  menu.menuPrincipal();

           if(opcao == 0){
               break;
           }
        }

    }
}