/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler.Helper;

import Model.Funcionario;

/**
 *
 * @author Pichau
 */
public class Campo_funcionario {
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
    private String cargo;
    private String salario;
    private String cpf;
    private String data_nasc;
    private String codigo;
    
    
    public boolean  pega_campo_funcionario(Funcionario funcionario){
        if (nome_real.isEmpty()|| nome_real.equals("")) {
            return false;
        }else{
            if (nome_uauario.isEmpty()|| nome_uauario.equals("")) {
                return  false;
            }else{
                if (senha.equals("")|| senha.isEmpty()) {
                    return false;
                }else{
                    if (email.isEmpty()|| email.equals("")) {
                        return false;
                    }else{
                        if (telefone.isEmpty()|| telefone.equals("")) {
                            return false;
                        }else{
                            if (cidade.equals("")|| cidade.isEmpty()) {
                                return false;
                            }else{
                                if (rua.equals("") || rua.isEmpty()) {
                                    return false;
                                }else{
                                    if (sexo.equals("")|| sexo.isEmpty()) {
                                        return false;
                                    }else{
                                        if (bairro.isEmpty()|| bairro.equals("")) {
                                            return false;
                                        }else{
                                            if (estado.isEmpty()|| estado.equals("")) {
                                                return false;
                                            }else{
                                                if (cep.isEmpty()|| this.cpf.isEmpty()|| this.data_nasc.isEmpty()) {
                                                    return false;
                                                }else{
                                                    funcionario.setCpf(cpf);
          funcionario.setData_nasc(data_nasc);
            funcionario.setBairro(bairro);
            funcionario.setCEP(cep);
            funcionario.setEmail(email);
            funcionario.setEstado(estado);
            funcionario.setNome(nome_real);
            funcionario.setNome_usuario(nome_uauario);
            funcionario.setSexo(sexo);
            funcionario.setRua(rua);
            funcionario.setSenha(senha);
            funcionario.setTelefone(telefone);
            funcionario.setCargo(cargo);
            funcionario.setSalario(salario);
            //funcionario.setId_pessoa(codigo);
            return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
    
    public boolean pega_campo_del(Funcionario fun){
        if (this.codigo.isEmpty()|| this.codigo.equals("")) {
            return  false;
        }else{
            fun.setId_pessoa(codigo);
            return  true;
        }
    }
    
    
    public boolean  atualiza_campo_funcionario(Funcionario funcionario){
        if (nome_real.isEmpty()|| nome_real.equals("")) {
            return false;
        }else{
            if (nome_uauario.isEmpty()|| nome_uauario.equals("") || this.codigo.isEmpty()) {
                return  false;
            }else{
                if (senha.equals("")|| senha.isEmpty()) {
                    return false;
                }else{
                    if (email.isEmpty()|| email.equals("")) {
                        return false;
                    }else{
                        if (telefone.isEmpty()|| telefone.equals("")) {
                            return false;
                        }else{
                            if (cidade.equals("")|| cidade.isEmpty()) {
                                return false;
                            }else{
                                if (rua.equals("") || rua.isEmpty()) {
                                    return false;
                                }else{
                                    if (sexo.equals("")|| sexo.isEmpty()) {
                                        return false;
                                    }else{
                                        if (bairro.isEmpty()|| bairro.equals("")) {
                                            return false;
                                        }else{
                                            if (estado.isEmpty()|| estado.equals("")) {
                                                return false;
                                            }else{
                                                if (cep.isEmpty()|| this.cpf.isEmpty()|| this.data_nasc.isEmpty()) {
                                                    return false;
                                                }else{
                                                    funcionario.setCpf(cpf);
          funcionario.setData_nasc(data_nasc);
            funcionario.setBairro(bairro);
            funcionario.setCEP(cep);
            funcionario.setEmail(email);
            funcionario.setEstado(estado);
            funcionario.setNome(nome_real);
            funcionario.setNome_usuario(nome_uauario);
            funcionario.setSexo(sexo);
            funcionario.setRua(rua);
            funcionario.setSenha(senha);
            funcionario.setTelefone(telefone);
            funcionario.setCargo(cargo);
            funcionario.setSalario(salario);
            funcionario.setId_pessoa(codigo);
            return true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
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

    public String getData_nasc() {
        return data_nasc;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }
    
    
    
    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEmail() {
        return email;
    }

    public String getEstado() {
        return estado;
    }

    public String getNome_real() {
        return nome_real;
    }

    public String getNome_uauario() {
        return nome_uauario;
    }

    public String getRua() {
        return rua;
    }

    public String getSenha() {
        return senha;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNome_real(String nome_real) {
        this.nome_real = nome_real;
    }

    public void setNome_uauario(String nome_uauario) {
        this.nome_uauario = nome_uauario;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
    
    
    
}
