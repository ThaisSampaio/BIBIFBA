package edu.ifba.gerenBiblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ifba.gerenBiblioteca.model.Livros;

public interface IPLivrosrepository extends JpaRepository<Livros, Integer>{

}
