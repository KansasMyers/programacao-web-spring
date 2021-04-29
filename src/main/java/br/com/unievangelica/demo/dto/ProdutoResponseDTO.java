package br.com.unievangelica.demo.dto;

import br.com.unievangelica.demo.model.Produto;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class ProdutoResponseDTO {

	private Integer id;
	private String descricao;
	private Double valor;
	private String observacao;

	public static ProdutoResponseDTO construirDTO(Produto produto) {
		return new ProdutoResponseDTO(produto.getId(), produto.getDescricao(), produto.getValor(), produto.getObservacao());
	}

}