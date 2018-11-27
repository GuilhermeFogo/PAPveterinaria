/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler.Helper;

import Model.Animais;
import Model.Cliente;
import Model.Consulta;
import Model.Exame;

/**
 *
 * @author Pichau
 */
public class Campo_exame {
    private String tipo_pagamento;
    private String preco_exame;
    private String id_exame;
    private String realizado;
    private String nome_cliente;
    private String nome_animal;
    private String nome_exame;

    
    
    public  boolean pega_campos_consultaexame(Exame exame, Cliente cliente, Animais animal){
        if (this.tipo_pagamento.isEmpty()|| this.preco_exame.isEmpty()
                || realizado.isEmpty()|| this.nome_animal.isEmpty()|| this.nome_cliente.isEmpty()) {
            
            
            return  false;
        }else{
            exame.setData_exame(realizado);
            exame.setNome(nome_exame);
            exame.setPreco(preco_exame);
            exame.setTipo_pagamento(tipo_pagamento);
            animal.setNome_animal(nome_animal);
            cliente.setNome(nome_cliente);
            return true;
        }
       
    }
    
    public boolean pega_campo_del(Exame exame){
        if (this.id_exame.isEmpty()|| this.id_exame.equals("")) {
            return false;
        }else{
            exame.setId_exame(id_exame);
            return true;
        }
    }
    
    
    public  boolean atualiza_campo(Exame exame, Cliente cliente, Animais animal){
        if (this.tipo_pagamento.isEmpty()|| this.preco_exame.isEmpty()
                || this.id_exame.isEmpty() || realizado.isEmpty()|| this.nome_animal.isEmpty()|| this.nome_cliente.isEmpty()) {
            
            
            return  false;
        }else{
            exame.setData_exame(realizado);
            exame.setNome(nome_exame);
            exame.setPreco(preco_exame);
            exame.setTipo_pagamento(tipo_pagamento);
            animal.setNome_animal(nome_animal);
            cliente.setNome(nome_cliente);
            exame.setId_exame(id_exame);
            return true;
        }
       
    }
    
    public String getId_exame() {
        return id_exame;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public String getNome_exame() {
        return nome_exame;
    }

    public String getPreco_exame() {
        return preco_exame;
    }

    public String getRealizado() {
        return realizado;
    }

    public String getTipo_pagamento() {
        return tipo_pagamento;
    }

    public void setId_exame(String id_exame) {
        this.id_exame = id_exame;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public void setNome_exame(String nome_exame) {
        this.nome_exame = nome_exame;
    }

    public void setPreco_exame(String preco_exame) {
        this.preco_exame = preco_exame;
    }

    public void setRealizado(String realizado) {
        this.realizado = realizado;
    }

    public void setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }
    
    
    
    
    
    
}
