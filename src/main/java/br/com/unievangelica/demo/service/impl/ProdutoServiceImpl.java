package br.com.unievangelica.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unievangelica.demo.model.Produto;
import br.com.unievangelica.demo.repository.ProdutoRepository;
import br.com.unievangelica.demo.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public Produto save(Produto produto) {
		return this.produtoRepository.save(produto);
	}

	@Override
	public Optional<Produto> findById(Integer idProduto) {
		return this.produtoRepository.findById(idProduto);
	}

}
