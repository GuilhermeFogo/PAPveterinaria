package Controler.Helper;

import Model.Cliente;
import Model.Medico;

public class Campos_Clliente {
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
    private String cod_cliente;
   
    
    
    
    public boolean  pega_campo_cliente(Cliente cliente){
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
                                                    cliente.setBairro(bairro);
                                                    cliente.setCEP(cep);
                                                    cliente.setEmail(email);
                                                    cliente.setEstado(estado);
                                                    cliente.setNome(nome_real);
                                                    cliente.setNome_usuario(nome_uauario);
                                                    cliente.setSexo(sexo);
                                                    cliente.setRua(rua);
                                                    cliente.setSenha(senha);
                                                    cliente.setTelefone(telefone);
                                                    cliente.setCidade(cidade);
                                                    cliente.setCpf(cpf);
                                                    cliente.setData_nasc(data_nasc);
                                                    //cliente.setId_pessoa(cod_cliente);
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
    
    
    public boolean pega_campo_del(Cliente cliente){
        if (this.cod_cliente.isEmpty()|| this.cod_cliente.equals("")) {
            return false;
        }else{
            cliente.setId(cod_cliente);
            return  true;
        }
    }
    
    public boolean  atualiza_campo_cliente(Cliente cliente){
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
                                            if (estado.isEmpty()|| estado.equals("") || this.cod_cliente.isEmpty()) {
                                                return false;
                                            }else{
                                                if (cep.isEmpty()|| this.cpf.isEmpty()|| this.data_nasc.isEmpty()) {
                                                    return false;
                                                }else{
                                                    cliente.setBairro(bairro);
                                                    cliente.setCEP(cep);
                                                    cliente.setEmail(email);
                                                    cliente.setEstado(estado);
                                                    cliente.setNome(nome_real);
                                                    cliente.setNome_usuario(nome_uauario);
                                                    cliente.setSexo(sexo);
                                                    cliente.setRua(rua);
                                                    cliente.setSenha(senha);
                                                    cliente.setTelefone(telefone);
                                                    cliente.setCidade(cidade);
                                                    cliente.setCpf(cpf);
                                                    cliente.setData_nasc(data_nasc);
                                                    cliente.setId_pessoa(cod_cliente);
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
    
    public String getBairro() {
        return bairro;
    }

    public String getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(String cod_cliente) {
        this.cod_cliente = cod_cliente;
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
    
    
}
