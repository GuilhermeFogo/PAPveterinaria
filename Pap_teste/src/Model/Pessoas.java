package Model;

public class Pessoas extends Endereco {
	private String nome;
	private String sexo;
	private String email;
	private String nome_usuario;
	private String senha;
	private String id_pessoa;
        private String cpf;
        private String data_nasc;

    public String getCpf() {
        return cpf;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }
        
        
	
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome_usuario() {
		return nome_usuario;
	}
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getId_pessoa() {
		return id_pessoa;
	}
	public void setId_pessoa(String id_pessoa) {
		this.id_pessoa = id_pessoa;
	}
        
}
