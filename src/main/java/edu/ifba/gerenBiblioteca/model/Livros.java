package edu.ifba.gerenBiblioteca.model;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name= "Livros")




public class Livros {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer  id;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "referencia")
	private String referencia;
	
	
	@Column(name = "cadastro")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date cadastro;
    

	public void setRegistration(java.util.Date date) {
		// TODO Auto-generated method stub
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public Date getCadastro() {
		return cadastro;
	}


	public void setCadastro(Date cadastro) {
		this.cadastro = cadastro;
	}


	

}
