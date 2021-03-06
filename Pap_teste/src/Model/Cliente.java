package Model;

public class Cliente extends Pessoas {
	private String telefone;
	private String id;

	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

    @Override
    public String toString() {
        return getNome() + " "+getNome_usuario()+ " "+ getRua()+"  "+ getBairro() +" "+ getCEP()+
                getCidade()+" "+ getEmail() +" "+ getSexo() + getEstado()+" "+
                " "+ getTelefone()+" "+ getId_pessoa();
    }
        
}
