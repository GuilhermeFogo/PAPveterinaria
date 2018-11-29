package Model;

public class Fornecedor {
	private String email;
	private String telefone;
	private String id;
        private String nome_empresa;
        private String nome_contato;
        private String preco;
        
    public String getNome_contato() {
        return nome_contato;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public String getPreco() {
        return preco;
    }

    public void setNome_contato(String nome_contato) {
        this.nome_contato = nome_contato;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }   
	
    public String getEmail() {
	return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
	
    }
	
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
        return getNome_contato()+" "+ getNome_empresa()+ " "+ 
                getPreco()+" "+ getTelefone()+" "+ getId()
                +" "+ getEmail()
                ;
   }
    
    
}
