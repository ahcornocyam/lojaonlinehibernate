package br.sc.senai.lojaonline.main;

import java.text.ParseException;

import javax.persistence.EntityManager;

import br.sc.senai.lojaonline.model.Categoria;
import br.sc.senai.lojaonline.model.Pessoa;
import br.sc.senai.lojaonline.util.JPAUtil;

public class Atualizar {

	public static void main( String[] args ) throws ParseException {
		// TODO Auto-generated method stub
		/*
		 * Conexao com o banco
		 */
		EntityManager entityManager= new JPAUtil().getEntityManager();

		/*
		 * Atualizar Pessoa
		 */
		Pessoa pessoa = entityManager.find( Pessoa.class, 1L );
		pessoa.setNome( "Alexandre Roch" );

		/*
		 * Atualizar Categoria
		 */
		Categoria categoria =  entityManager.find( Categoria.class, 1L );
		categoria.setNome( "Carros" );

		/*
		 * Alterando no Banco de dados
		 */
		entityManager.getTransaction().begin();
		entityManager.merge( pessoa );
		entityManager.merge( categoria );
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
