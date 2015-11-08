package br.sc.senai.lojaonline.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "categorias" )
public class Categoria {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;

	private String nome;
	@OneToMany( mappedBy = "categorias" )
	private List<Produto> produtos;
	@ManyToMany(mappedBy= "categorias" )
	private List<Cliente> clientes;

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String name ) {
		this.nome = name;
	}
}
