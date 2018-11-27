package Controler.Helper;


import java.util.ArrayList;
import java.util.List;

import Model.Cliente;
import Model.DAO.Loguin_geral;
import Model.Funcionario;
import Model.Pessoas;

public class HelperCampos_loguin {
	String campo_usuario;
	String campo_pass;
	

    public void setCampo_usuario(String campo_usuario) {
        this.campo_usuario = campo_usuario;
    }

    public String getCampo_usuario() {
        return campo_usuario;
    }

    public String getCampo_pass() {
        return campo_pass;
    }

    public void setCampo_pass(String campo_pass) {
        this.campo_pass = campo_pass;
    }
    
    
	
	
	// verifica campos usuario e senha
	public boolean loguin() {
		Pessoas usu = new Pessoas();
                Loguin_geral log = new Loguin_geral();
                usu = log.loguin_geral();
		if (getCampo_pass().isEmpty() || getCampo_pass().equals(null)) {
			return false;
		}else {
			if (getCampo_usuario().isEmpty() || getCampo_usuario().equals(null)) {
				return false;
			}else {
				if (usu.getNome_usuario().equals(this.campo_usuario)&& usu.getSenha().equals(this.campo_pass)) {
					return true;
				}
			}
		}
		return false;
	}

	
	

}
