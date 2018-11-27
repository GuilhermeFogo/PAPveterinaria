/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler.Helper;

import Model.Fornecedor;
import Model.Funcionario;
import Model.Medicamento;
import java.sql.Date;

/**
 *
 * @author Pichau
 */
public class Campo_Fornecesor {
    private String nome_contato;
    private String email;
    private String preco_fornecedor;
    private String nome_empresa;
    private String telefone;
    private String codigo;

    // verificando nullos e vazio
    public boolean  pega_campo_fornecedor(Fornecedor fornecedor){
        if (nome_contato.isEmpty()|| nome_contato.equals("")) {
            return false;
        }else{
            if (nome_empresa.isEmpty()|| nome_empresa.equals("")) {
                return false;
            }else{
                if (email.isEmpty()|| email.equals("")) {
                    return false;
                }else{
                                    if (preco_fornecedor.isEmpty()|| preco_fornecedor.equals("")) {
                                        return false;
                                    }else{
                                        if (telefone.isEmpty()) {
                                            return false;
                                        }else{
                                            // definindo valores para fornecedor
                                            fornecedor.setEmail(email);
                                            fornecedor.setNome_contato(nome_contato);
                                            fornecedor.setNome_empresa(nome_empresa);
                                            fornecedor.setPreco(preco_fornecedor);
                                            fornecedor.setTelefone(telefone);
                                           
                                           return  true;
                                        }
                                        
                                    }
                                }
                            }
                        }
                    }
              
            
        
   

    // gets e sets
    
    

   public boolean pega_campo_del(Fornecedor fornecedor){
        if (this.codigo.isEmpty()|| this.codigo.equals("")) {
            return false;
        }else{
            fornecedor.setId(codigo);
            return  true;
        }
    }
   
   public boolean  alterar_campo_fornecedor(Fornecedor fornecedor){
        if (nome_contato.isEmpty()|| nome_contato.equals("")) {
            return false;
        }else{
            if (nome_empresa.isEmpty()|| nome_empresa.equals("")) {
                return false;
            }else{
                if (email.isEmpty()|| email.equals("")) {
                    return false;
                }else{
                                    if (preco_fornecedor.isEmpty()|| preco_fornecedor.equals("")) {
                                        return false;
                                    }else{
                                        if (telefone.isEmpty() || this.codigo.isEmpty()) {
                                            return false;
                                        }else{
                                            // definindo valores para fornecedor
                                            fornecedor.setEmail(email);
                                            fornecedor.setNome_contato(nome_contato);
                                            fornecedor.setNome_empresa(nome_empresa);
                                            fornecedor.setPreco(preco_fornecedor);
                                            fornecedor.setTelefone(telefone);
                                            fornecedor.setId(codigo);
                                           
                                           return  true;
                                        }
                                        
                                    }
                                }
                            }
                        }
                    }
   
   
   
   
   
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
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

    public String getNome_contato() {
        return nome_contato;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    

    public String getPreco_fornecedor() {
        return preco_fornecedor;
    }

    

    

    
    

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    

    public void setPreco_fornecedor(String preco_fornecedor) {
        this.preco_fornecedor = preco_fornecedor;
    }

    
    
    
}
