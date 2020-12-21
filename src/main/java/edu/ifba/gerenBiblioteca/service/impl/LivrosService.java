package edu.ifba.gerenBiblioteca.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import edu.ifba.gerenBiblioteca.model.Livros;
import edu.ifba.gerenBiblioteca.repository.IPLivrosrepository;
import edu.ifba.gerenBiblioteca.service.IPLivrosService;


@Service
public class LivrosService implements IPLivrosService {
	@Autowired
	private IPLivrosrepository repository;

	@Override
	public void save(Livros l) {
		repository.save(l);
		
	}

	@Override
	public void delete(Integer idLivro) {
		repository.deleteById(idLivro);
		
	}

	@Override
	public Livros find(Integer idLivro) {
		Optional<Livros> l =repository.findById(idLivro);
		return l.isPresent() ? l.get(): null;
		
	}

	@Override
	public List<Livros> findAll() {
		
		return repository.findAll(Sort.by("cadastro").descending());
	}

}
