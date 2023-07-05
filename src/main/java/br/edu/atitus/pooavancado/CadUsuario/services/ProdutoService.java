package br.edu.atitus.pooavancado.CadUsuario.services;

import org.springframework.data.repository.query.Param;

import br.edu.atitus.pooavancado.CadUsuario.entities.Produto;
import br.edu.atitus.pooavancado.CadUsuario.repositories.ProdutoRepository;

public interface ProdutoService extends GenericService<Produto, ProdutoRepository>{
	
	void alteraStatus(
			@Param("id") long id) 
					throws Exception;

}