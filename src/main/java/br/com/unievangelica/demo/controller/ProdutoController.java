package br.com.unievangelica.demo.controller;

import static br.com.unievangelica.demo.dto.ProdutoResponseDTO.construirDTO;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unievangelica.demo.dto.ProdutoDTO;
import br.com.unievangelica.demo.dto.ProdutoResponseDTO;
import br.com.unievangelica.demo.model.Produto;
import br.com.unievangelica.demo.service.ProdutoService;

@RequestMapping("/produto")
@RestController
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@PostMapping
	public ResponseEntity<ProdutoResponseDTO> salvar(@RequestBody ProdutoDTO produtoDTO) {
		Produto produtoCriado = produtoService.save(produtoDTO.construirObjeto());
		return new ResponseEntity<>(construirDTO(produtoCriado), HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProdutoResponseDTO> getProdutoById(@PathVariable("id") Integer idProduto) {
		Optional<Produto> produto = produtoService.findById(idProduto);

		if (produto.isPresent()) {
			return new ResponseEntity<>(construirDTO(produto.get()), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}

}