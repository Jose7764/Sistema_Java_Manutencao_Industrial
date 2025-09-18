package org.example.dao;

import org.example.model.Tecnico;
import org.example.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TecnicoDAO {

    public void cadastrarTecnico(Tecnico tecnico)throws SQLException {

        String query = """
                INSERT INTO Tecnico
                (nome , especialidade)
                VALUES (?, ?)
                """;

        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, tecnico.getNome());
            stmt.setString(2, tecnico.getEspecialidade());
            stmt.executeUpdate();

            System.out.println("||===========================================================||");
            System.out.println("||                 Cadastrado com sucesso                    ||");
            System.out.println("||===========================================================||");
        }catch (SQLException e){

            System.err.println("||===========================================================||");
            System.err.println("|| Erro ao tentar Cadastrar um Tecnico: "+ e.getMessage());
            System.err.println("||===========================================================||");
        }
    }
}
