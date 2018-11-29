package Model;

import java.util.Date;

public class Medicamento {
        private String preco;
	private String descricao;
	private String nome;
	private int dose;
	private String validade;
	private String id;
        private String quantidade;

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
        
        
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDose() {
		return dose;
	}
	public void setDose(int dose) {
		this.dose = dose;
	}
	public String getValidade() {
		return validade;
	}
	public void setValidade(String validade) {
		this.validade = validade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

    public void setPreco(String preco) {
        this.preco = preco;
    }
        
    public String getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return getId() +" " +getNome() +" " +getPreco() +" "+getQuantidade()+" "+ getValidade()
                + getDescricao()+ getDose();
    }	
}
