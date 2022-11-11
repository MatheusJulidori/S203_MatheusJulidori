package br.inatel.labs.labads.padraomvc.model.entidade;

public class Produto {
	
	private Long id;
	
	private String descricao;
	
	private Double preco;

	public Produto(Long id, String descricao, Double preco) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.preco = preco;
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", decisao=" + descricao + ", preco=" + preco + "]";
	}
	
	

}
