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
import Model.Medico;

/**
 *
 * @author Pichau
 */
public class Campo_consulta {
    
    private String tipo_consulta;
    private String tipo_pagamento;
    private String preco_consulta;
    private String horario;
    private String codigo;
    private String nome_cliente;
    private String nome_animal;
    
    public  boolean pega_campos_consulta(Consulta consulta, Cliente cliente, Animais animal){
        if (this.tipo_consulta.isEmpty()|| this.tipo_pagamento.isEmpty()|| this.preco_consulta.isEmpty()
                || horario.isEmpty()|| this.nome_animal.isEmpty()|| this.nome_cliente.isEmpty()) {
            
            
            return  false;
        }else{
            consulta.setData_consulta(horario);
            consulta.setTipo_consulta(tipo_consulta);
            consulta.setTipo_pagamento(tipo_pagamento);
            //consulta.setId(id_consulta);
            consulta.setPreco(preco_consulta);
            animal.setNome_animal(nome_animal);
            cliente.setNome(nome_cliente);
            return true;
        }
       
    }
    
    public boolean pega_campo_del(Consulta consulta){
        if (this.codigo.isEmpty()|| this.codigo.equals("")) {
            return false;
        }else{
            consulta.setId(codigo);
            return true;
        }
    }
    
    public  boolean atualiza_campos_consulta(Consulta consulta, Cliente cliente, Animais animal){
        if (this.tipo_consulta.isEmpty()|| this.tipo_pagamento.isEmpty()|| this.preco_consulta.isEmpty()
                || this.codigo.isEmpty() || horario.isEmpty()|| this.nome_animal.isEmpty()|| this.nome_cliente.isEmpty()) {
            
            
            return  false;
        }else{
            consulta.setData_consulta(horario);
            consulta.setTipo_consulta(tipo_consulta);
            consulta.setTipo_pagamento(tipo_pagamento);
            consulta.setId(codigo);
            consulta.setPreco(preco_consulta);
            animal.setNome_animal(nome_animal);
            cliente.setNome(nome_cliente);
            return true;
        }
       
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    

    public String getPreco_consulta() {
        return preco_consulta;
    }

    

    public String getTipo_consulta() {
        return tipo_consulta;
    }

    public String getTipo_pagamento() {
        return tipo_pagamento;
    }


   

    public void setPreco_consulta(String preco_consulta) {
        this.preco_consulta = preco_consulta;
    }

    

    public void setTipo_consulta(String tipo_consulta) {
        this.tipo_consulta = tipo_consulta;
    }

    public void setTipo_pagamento(String tipo_pagamento) {
        this.tipo_pagamento = tipo_pagamento;
    }
    
    
    
}
