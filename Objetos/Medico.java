package Objetos;

public class Medico extends Pessoas {
	private String CRV;
	private String especialidade;
	private String tratamento;
	private String telefone;
	
	public String getCRV() {
		return CRV;
	}
	public void setCRV(String cRV) {
		CRV = cRV;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getTratamento() {
		return tratamento;
	}
	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
