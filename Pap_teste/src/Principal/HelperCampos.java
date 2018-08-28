package Principal;

import java.util.ArrayList;
import java.util.List;

import Model.Cliente;
import Model.Funcionario;
import Model.Usuario;

public class HelperCampos {
	String campo_usuario;
	String campo_pass;
	
	
	public String getPass() {
		return campo_pass;
	}
	public void setPass(String pass) {
		this.campo_pass = pass;
	}
	public void setUsuario(String usuario) {
		this.campo_usuario = usuario;
	}
	public String getUsuario() {
		return campo_usuario;
	}
	
	public boolean loguin(String campo_usu, String campo_senha) {
		Usuario usu = new Usuario();
		usu.Ver_banco();
		
		if (this.campo_pass.equals(null)|| this.campo_pass.isEmpty()) {
			return false;
		}else {
			if (this.campo_usuario.isEmpty() || this.campo_usuario.equals(null)) {
				return false;
			}else {
				if (usu.getNome_usu().equals(this.campo_usuario)&& usu.getSenha().equals(this.campo_pass)) {
					return true;
				}
			}
		}
		return false;
	}

}
