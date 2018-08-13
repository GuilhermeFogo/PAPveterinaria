package Objetos;

public class Funcionario extends Pessoas {
	private String telefone;
	private String id_funcionario;
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setId_funcionario(String id_funcionario) {
		this.id_funcionario = id_funcionario;
	}
	public String getId_funcionario() {
		return id_funcionario;
	}

}
