package org.example.dao;

import org.example.model.Peca;
import org.example.util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PecaDAO {

    public void cadastrarPeca(Peca peca) throws SQLException {
        String query = """
                INSERT INTO Peca
                (nome , estoque)
                VALUE (? , ?)
                """;

        try(Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, peca.getNome());
            stmt.setDouble(2, peca.getEstoque());
            stmt.executeUpdate();

            System.out.println("||===========================================================||");
            System.out.println("||                 Cadastrado com sucesso                    ||");
            System.out.println("||===========================================================||");
        }catch (SQLException e){

            System.out.println("||===========================================================||");
            System.out.println("||  Erro ao cadastrar uma Peça: "+ e.getMessage());
            System.out.println("||===========================================================||");
        }
    }

}
