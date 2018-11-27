package Model;

import java.util.Date;
import java.util.Scanner;

public class Exame extends Pagamento{
	
	private String data_exame;
	private String nome;
	private String preco_exame; 
        private String id_exame;
	public String getData_exame() {
		return data_exame;
	}
	public void setData_exame(String data_exame) {
		this.data_exame = data_exame;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

        public String getPreco_exame() {
        return preco_exame;
        }
        
	
	public void setPreco(String preco) {
		this.preco_exame = preco;
	}

    public String getId_exame() {
        return id_exame;
    }

    public void setId_exame(String id_exame) {
        this.id_exame = id_exame;
    }

    @Override
    public String toString() {
        return getNome() +" " + getData_exame() +" "+ getId_exame()+ " "+ getPreco()+
                " "+ getTipo_pagamento()+ "/n";
    }
    
    
        
}
