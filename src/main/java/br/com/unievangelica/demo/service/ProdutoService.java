package br.com.unievangelica.demo.service;

import java.util.Optional;

import br.com.unievangelica.demo.model.Produto;

public interface ProdutoService {

	public Produto save(Produto produto);

	public Optional<Produto> findById(Integer idProduto);

}
