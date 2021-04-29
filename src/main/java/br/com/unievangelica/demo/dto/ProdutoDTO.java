package br.com.unievangelica.demo.dto;

import br.com.unievangelica.demo.model.Produto;
import lombok.Getter;

@Getter
public class ProdutoDTO {

	private String descricao;
	private Double valor;
	private String observacao;

	public Produto construirObjeto() {
		return new Produto(null, descricao, valor, observacao);
	}
	
}
