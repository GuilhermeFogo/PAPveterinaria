/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler.Helper;

import Model.Medico;

public class Campo_veterinario {
    
    private String nome_uauario; 
    private String nome_real; 
    private String senha; 
    private String telefone;
    private String email;
    private String sexo; 
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;     
    private String cpf;
    private String data_nasc;
    private String codigo;
    private  String especialidade;
    private  String salario;
    private String crv;
    private String horario;
    
    
    public boolean pega_campos(Medico medico){
        if (this.bairro.isEmpty()|| this.cep.isEmpty()|| this.cidade.isEmpty()|| this.email.isEmpty()||
                this.estado.isEmpty()|| this.nome_real.isEmpty()|| this.nome_uauario.isEmpty()|| this.rua.isEmpty()||
                this.senha.isEmpty()|| this.sexo.isEmpty()|| this.telefone.isEmpty()|| this.cpf.isEmpty()
                || this.data_nasc.isEmpty()) {
           return false;
        }else{
           medico.setBairro(bairro);
           medico.setCEP(cep);
           medico.setEmail(email);
           medico.setEstado(estado);
           medico.setNome(nome_real);
           medico.setNome_usuario(nome_uauario);
           medico.setRua(rua);
           medico.setSenha(senha);
           medico.setSexo(sexo);
           medico.setTelefone(telefone);
           medico.setCidade(cidade);
           medico.setData_nasc(data_nasc);
           medico.setCpf(cpf);
           medico.setCRV(crv);
           medico.setSalario(salario);
           medico.setHorario(horario);
           medico.setEspecialidade(especialidade);
           //medico.setId_pessoa(codigo);
            return true;
        }
    }
    
    public boolean pega_campo_del(Medico medico){
        if (this.codigo.isEmpty()|| this.codigo.equals("")) {
            return false;
        }else{
            medico.setId_pessoa(codigo);
            return  true;
        }
    }
    
    
    public boolean atualiza_campos(Medico medico){
        if (this.bairro.isEmpty()|| this.cep.isEmpty()|| this.cidade.isEmpty()|| this.email.isEmpty()||
                this.estado.isEmpty()|| this.nome_real.isEmpty()|| this.nome_uauario.isEmpty()|| this.rua.isEmpty()||
                this.senha.isEmpty()|| this.sexo.isEmpty()|| this.telefone.isEmpty()|| this.cpf.isEmpty()
                || this.data_nasc.isEmpty() || this.codigo.isEmpty()) {
           return false;
        }else{
           medico.setBairro(bairro);
           medico.setCEP(cep);
           medico.setEmail(email);
           medico.setEstado(estado);
           medico.setNome(nome_real);
           medico.setNome_usuario(nome_uauario);
           medico.setRua(rua);
           medico.setSenha(senha);
           medico.setSexo(sexo);
           medico.setTelefone(telefone);
           medico.setCidade(cidade);
           medico.setData_nasc(data_nasc);
           medico.setCpf(cpf);
           medico.setCRV(crv);
           medico.setSalario(salario);
           medico.setHorario(horario);
           medico.setEspecialidade(especialidade);
           medico.setId_pessoa(codigo);
            return true;
        }
    }
    
    
    
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getData_nasc() {
        return data_nasc;
    }
    
    
    public String getNome_uauario() {
        return nome_uauario;
    }

    
    public void setNome_uauario(String nome_uauario) {
        this.nome_uauario = nome_uauario;
    }

    
    public String getNome_real() {
        return nome_real;
    }

    
    public void setNome_real(String nome_real) {
        this.nome_real = nome_real;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCrv() {
        return crv;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getHorario() {
        return horario;
    }

    public String getSalario() {
        return salario;
    }

    public void setCrv(String crv) {
        this.crv = crv;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
   
    
    
    
    
}
