package app.ifmoney.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Table(name = "tbl_contas_bancarias")
public class ContasBancariasModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID pkConta;
    @Column(nullable = false)
    private Integer fkTipoConta;
    @Column(nullable = false)
    private Integer fkGrupoConta;
    @Column(nullable = false, length = 50)
    private String descricaoBanco;
    @Column(nullable = false)
    private Integer bancoNumero;
    @Column(nullable = false)
    private Integer agenciaNumero;
    @Column(nullable = false, length = 50)
    private String numeroConta;
    @Column(nullable = false)
    private Double saldoInicial;
    @Column(nullable = false)
    private Integer contaAtiva;
    @Column(nullable = false)
    private LocalDateTime dataCriacao;

    // Getter and Setter

    public UUID getPkConta() {
        return pkConta;
    }

    public void setPkConta(UUID pkConta) {
        this.pkConta = pkConta;
    }

    public Integer getFkGrupoConta() {
        return fkGrupoConta;
    }

    public void setFkGrupoConta(Integer fkGrupoConta) {
        this.fkGrupoConta = fkGrupoConta;
    }

    public Integer getFkTipoConta() {
        return fkTipoConta;
    }

    public void setFkTipoConta(Integer fkTipoConta) {
        this.fkTipoConta = fkTipoConta;
    }

    public Integer getBancoNumero() {
        return bancoNumero;
    }

    public void setBancoNumero(Integer bancoNumero) {
        this.bancoNumero = bancoNumero;
    }

    public Integer getAgenciaNumero() {
        return agenciaNumero;
    }

    public void setAgenciaNumero(Integer agenciaNumero) {
        this.agenciaNumero = agenciaNumero;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public String getDescricaoBanco() {
        return descricaoBanco;
    }

    public void setDescricaoBanco(String descricaoBanco) {
        this.descricaoBanco = descricaoBanco;
    }

    public Integer getContaAtiva() {
        return contaAtiva;
    }

    public void setContaAtiva(Integer contaAtiva) {
        this.contaAtiva = contaAtiva;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

}
