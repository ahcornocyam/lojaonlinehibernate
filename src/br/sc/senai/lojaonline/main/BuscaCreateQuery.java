package br.sc.senai.lojaonline.main;

import java.util.List;

import javax.persistence.EntityManager;

import br.sc.senai.lojaonline.model.Categoria;
import br.sc.senai.lojaonline.util.JPAUtil;

public class BuscaCreateQuery {

	public static void main( String[] args ){

		/*
		 * Conexao com o banco
		 */
		EntityManager entityManager = new JPAUtil().getEntityManager();

		List<Categoria> categorias = entityManager.createQuery(   "SELECT c "
															   + "FROM Categoria c "
															   + "WHERE nome like :nome "
															   + "ORDER BY nome ASC",Categoria.class)
															  .setParameter( "nome" , "C%" )
															  .getResultList();

		for( Categoria categoria : categorias ){
			System.out.println( "Nome: " + categoria.getNome() );
		}
	}
}
