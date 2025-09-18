package org.example.service;

import org.example.dao.*;
import org.example.model.*;
import org.example.view.*;

import java.sql.SQLException;

public class Cadastrar {

    MaquinaDAO maquinaDAO = new MaquinaDAO();
    TecnicoDAO tecnicoDAO = new TecnicoDAO();
    PecaDAO pecaDAO = new PecaDAO();

    View view = new View();
    Maquina maquina;
    Tecnico tecnico;
    Peca peca;

    public void cadastrarMaquina() throws SQLException {

        maquina = view.cadastrarMaquina();

        maquinaDAO.cadastrarMaquina(maquina);
    }

    public void cadastrarTecnico() throws SQLException{
        tecnico = view.cadastrarTecnico();
        tecnicoDAO.cadastrarTecnico(tecnico);
    }

    public void cadastrarPeca() throws  SQLException{
        peca = view.cadastrarPeca();
        pecaDAO.cadastrarPeca(peca);
    }



}
