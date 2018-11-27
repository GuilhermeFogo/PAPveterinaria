package Model;

public class Medico extends Pessoas {
	private String CRV;
	private String especialidade;
	private String horario;
	private String telefone;
        private String salario;
	
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

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
	
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
        
        
	
	
	

}
