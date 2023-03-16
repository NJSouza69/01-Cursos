package app.ifmoney.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class ContasBancariasDto {

    @NotNull
    private Integer fkTipoConta;
    @NotNull
    private Integer fkGrupoConta;
    @NotBlank
    @Size(max=50)
    private String descricaoBanco;
    @NotNull
    private Integer bancoNumero;
    @NotNull
    private Integer agenciaNumero;
    @NotBlank
    @Size(max=50)
    private String numeroConta;
    @NotNull
    private Double saldoInicial;
    @NotNull
    private Integer contaAtiva;

    public ContasBancariasDto() {
    }

    // Getter and Setter

    public Integer getFkTipoConta() {
        return fkTipoConta;
    }

    public void setFkTipoConta(Integer fkTipoConta) {
        this.fkTipoConta = fkTipoConta;
    }

    public Integer getFkGrupoConta() {
        return fkGrupoConta;
    }

    public void setFkGrupoConta(Integer fkGrupoConta) {
        this.fkGrupoConta = fkGrupoConta;
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
}
