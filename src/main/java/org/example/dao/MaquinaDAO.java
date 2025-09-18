package org.example.dao;

import org.example.model.Maquina;
import org.example.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MaquinaDAO {

    public void cadastrarMaquina(Maquina maquina)throws SQLException {

        String query = """
                INSERT INTO Maquina
                (nome, setor, status)
                VALUES (?, ?, ?)
                """;

        try (Connection connection = Conexao.conectar(); PreparedStatement stmt = connection.prepareStatement(query)){

            stmt.setString(1, maquina.getNome());
            stmt.setString(2, maquina.getSetor());
            stmt.setString(3, maquina.getStatus());
            stmt.executeUpdate();

            System.out.println("||===========================================================||");
            System.out.println("||                 Cadastrado com sucesso                    ||");
            System.out.println("||===========================================================||");

        }catch (SQLException e){
            System.err.println("||===========================================================||");
            System.err.println("|| Erro ao cadastrar máquina: " + e.getMessage());
            System.err.println("||===========================================================||");
        };

    }



}
