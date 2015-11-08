package br.sc.senai.lojaonline.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;

import br.sc.senai.lojaonline.model.Categoria;
import br.sc.senai.lojaonline.model.Pessoa;
import br.sc.senai.lojaonline.util.JPAUtil;

public class Adicionar {

	public static void main( String[] args ) throws ParseException {
		// TODO Auto-generated method stub

		/*
		 * Conexao com o banco
		 */
		new JPAUtil().getEntityManager();
		JPAUtil jpautil =  new JPAUtil();
		EntityManager entityManager = jpautil.getEntityManager();

		//formatar data
		SimpleDateFormat formatar = new SimpleDateFormat( "dd/mm/yyyy" );

		/*
		 * Informacoes da pessoa 1
		 */
		Pessoa pessoa  =  new Pessoa();
		pessoa.setNome( "Maycon" );
		pessoa.setDocumento( "121.345.677" );
		pessoa.setDataDeNascimento( formatar.parse( "13/04/1985" ) );

		/*
		 * Informação da pessoa 2
		 */
		Pessoa pessoa2 = new	Pessoa();
		pessoa2.setNome( "fulano" );
		pessoa2.setDocumento( "123.456.678" );
		pessoa2.setDataDeNascimento( formatar.parse( "12/03/1988" ) );

		/*
		 * Inserir Categorias
		 */
		Categoria categoria = new Categoria();
		categoria.setNome("Automovel");


		Categoria categoria2 = new Categoria();
		categoria2.setNome("Eletronicos");

		Categoria categoria3 = new Categoria();
		categoria3.setNome("Livros");


		/*
		 * Inserindo as informações no Banco de dados
		 */
		entityManager.getTransaction().begin();
		entityManager.persist( pessoa );
		entityManager.persist( pessoa2 );
		entityManager.persist(categoria);
		entityManager.persist(categoria2);
		entityManager.persist(categoria3);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}