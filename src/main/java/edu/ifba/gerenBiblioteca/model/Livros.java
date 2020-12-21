package edu.ifba.gerenBiblioteca.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "Livros")
@Getter
@Setter



public class Livros {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer  idLivro;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "referencia")
	private String referencia;
	
	
	@Column(name = "cadastro")
	private Date cadastro;


	public void setRegistration(java.util.Date date) {
		// TODO Auto-generated method stub
		
	}


	

}
