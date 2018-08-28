package Model;

public  abstract class Endereco {
	private String Rua;
	private String Estado;
	private String bairro;
	private String cidade;
	private String CEP;
	
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	
	public String getCEP() {
		return CEP;
	}
	public void setCEP(String cEP) {
		CEP = cEP;
	}
}
