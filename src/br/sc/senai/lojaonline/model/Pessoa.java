package br.sc.senai.lojaonline.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "pessoas" )
public class Pessoa {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "id" )
	private Long id;

	@Column( name = "nome" )
	private String nome;

	@Temporal( TemporalType.DATE )
	@Column( name = "data_de_nascimento" )
	private Date dataDeNascimento;

	@Column( name = "documento" )
	private	String documento;

	@OneToOne( mappedBy = "pessoa" )
	private Cliente cliente;


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente( Cliente cliente ) {
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome( String nome ) {
		this.nome = nome;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento( Date dataDeNascimento ) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento( String documento ) {
		this.documento = documento;
	}
}

