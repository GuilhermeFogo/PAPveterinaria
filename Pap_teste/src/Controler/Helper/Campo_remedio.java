/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler.Helper;

import Model.Fornecedor;
import Model.Medicamento;

/**
 *
 * @author Pichau
 */
public class Campo_remedio {

    private String nome_remedio;
    private String validade;
    private String descricao;
    private String quantidade;
    private String dose;
    private String preco_remedio;
    private String codigo;
    
    
    // verificando nullos e vazio
    public boolean  pega_campo_remedio(Medicamento remedio){
        if (quantidade.isEmpty()|| quantidade.equals(null)|| nome_remedio.isEmpty()|| nome_remedio.equals(null)|| validade.isEmpty()
                || validade.equals(null)|| dose.isEmpty() || dose.equals(null)|| preco_remedio.isEmpty()|| preco_remedio.equals(null)||
                descricao.isEmpty()|| descricao.equals(null)) {
            return  false;
        }else{
            remedio.setDescricao(descricao);
            remedio.setNome(nome_remedio);
            remedio.setPreco(preco_remedio);
            remedio.setQuantidade(quantidade);
            remedio.setValidade(validade);
            return  true;
        }
        
    }
    
    public boolean pega_campo_del(Medicamento remedio){
        if (this.codigo.isEmpty()|| this.codigo.equals("")) {
            return false;
        }else{
            remedio.setId(codigo);
            return  true;
        }
    }
    
    
    public boolean  atualiza_campo_remedio(Medicamento remedio){
        if (quantidade.isEmpty()|| quantidade.equals(null)|| nome_remedio.isEmpty()|| nome_remedio.equals(null)|| validade.isEmpty()
                || validade.equals(null)|| dose.isEmpty() || dose.equals(null)|| preco_remedio.isEmpty()|| preco_remedio.equals(null)||
                descricao.isEmpty()|| descricao.equals(null) || this.codigo.isEmpty()) {
            return  false;
        }else{
            remedio.setDescricao(descricao);
            remedio.setNome(nome_remedio);
            remedio.setPreco(preco_remedio);
            remedio.setQuantidade(quantidade);
            remedio.setValidade(validade);
            remedio.setId(codigo);
            return  true;
        }
        
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
       
    /**
     * @return the nome_remedio
     */
    public String getNome_remedio() {
        return nome_remedio;
    }

    /**
     * @param nome_remedio the nome_remedio to set
     */
    public void setNome_remedio(String nome_remedio) {
        this.nome_remedio = nome_remedio;
    }

    /**
     * @return the validade
     */
    public String getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(String validade) {
        this.validade = validade;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the dose
     */
    public String getDose() {
        return dose;
    }

    /**
     * @param dose the dose to set
     */
    public void setDose(String dose) {
        this.dose = dose;
    }

    /**
     * @return the preco_remedio
     */
    public String getPreco_remedio() {
        return preco_remedio;
    }

    /**
     * @param preco_remedio the preco_remedio to set
     */
    public void setPreco_remedio(String preco_remedio) {
        this.preco_remedio = preco_remedio;
    }
    
    
}
