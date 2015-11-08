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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "compras" )
public class Compra {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column
	private Long id;

	@Temporal( TemporalType.DATE )
	@Column( name = "data_compra" )
	private Date dataCompra;

	@ManyToOne
	@JoinColumn( name = "cliente_id" )
	private Cliente cliente;

	@ManyToMany
	@JoinTable( name = "compras_tem_produtos",
						joinColumns = { @JoinColumn( name = "compra_id" ) },
						inverseJoinColumns = {@JoinColumn( name = "produto_id" ) } )
	private List<Produto> produtos;

	public Long getId() {
		return id;
	}

	public void setId( Long id ) {
		this.id = id;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra( Date dataCompra ) {
		this.dataCompra = dataCompra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente( Cliente cliente ) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos( List<Produto> produtos ) {
		this.produtos = produtos;
	}
}
