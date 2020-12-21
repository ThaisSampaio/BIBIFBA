package edu.ifba.gerenBiblioteca.service;

import java.util.List;

import edu.ifba.gerenBiblioteca.model.Livros;

public interface IPLivrosService {

	void save(Livros l);
	void delete(Integer idLivro);
	Livros find(Integer idLivro);
	
	List<Livros>findAll();
}
