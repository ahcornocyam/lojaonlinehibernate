package br.sc.senai.lojaonline.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "clientes" )
public class Cliente {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private Long id;

	@OneToOne
	@JoinColumn( name = "pessoa_id" )
	private Pessoa pessoa;

	@Temporal( TemporalType.DATE )
	@Column( name = "data_cadastro" )
	private Date dataCadastro;

	@ManyToMany
	@JoinTable( name = "clientes_gostam_de_categorias_de_produtos" , joinColumns = {
			@JoinColumn( name = "cliente_id" ) }, inverseJoinColumns = { @JoinColumn( name = "categoria_id" ) } )
	private List<Categoria> categorias;
	@OneToMany( mappedBy = "cliente" )
	private List<Compra> compras;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa( Pessoa pessoa ) {
		this.pessoa = pessoa;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro( Date dataCadastro ) {
		this.dataCadastro = dataCadastro;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias( List<Categoria> categorias ) {
		this.categorias = categorias;
	}

	public List<Compra> getCompras() {
		return compras;
	}

	public void setCompras( List<Compra> compras ) {
		this.compras = compras;
	}

}
