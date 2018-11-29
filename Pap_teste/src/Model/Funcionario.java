package Model;

public class Funcionario extends Pessoas {
	private String telefone;
	private String id_funcionario;
        private  String cargo;
        private String salario;
	
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

    public String getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }  

    @Override
    public String toString() {
        return getNome() + " "+getNome_usuario()+ " "+ getRua()+"  "+ getBairro() +" "+ getCEP()+
                getSalario() +" "+ getCargo() +" "+ getEmail() +" "+ getSexo() +
                " "+ getTelefone();
        
    }
    
    
}
