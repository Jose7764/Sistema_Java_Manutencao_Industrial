package org.example.model;

import java.util.Date;

public class OrdemManutencao {
    private int id;
    private int idMaquina;
    private int idTecnico;
    private Date dataSolicitacao;
    private String status; // PENDENTE / EXECUTADA / CANCELADA

    public OrdemManutencao() {}

    public OrdemManutencao(int id, int idMaquina, int idTecnico, Date dataSolicitacao, String status) {
        this.id = id;
        this.idMaquina = idMaquina;
        this.idTecnico = idTecnico;
        this.dataSolicitacao = dataSolicitacao;
        this.status = status;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdMaquina() { return idMaquina; }
    public void setIdMaquina(int idMaquina) { this.idMaquina = idMaquina; }

    public int getIdTecnico() { return idTecnico; }
    public void setIdTecnico(int idTecnico) { this.idTecnico = idTecnico; }

    public Date getDataSolicitacao() { return dataSolicitacao; }
    public void setDataSolicitacao(Date dataSolicitacao) { this.dataSolicitacao = dataSolicitacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
