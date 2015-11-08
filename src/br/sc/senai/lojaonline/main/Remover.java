package br.sc.senai.lojaonline.main;

import javax.persistence.EntityManager;

import br.sc.senai.lojaonline.model.Categoria;
import br.sc.senai.lojaonline.util.JPAUtil;

public class Remover {

	public static void main( String[] args ) {
		// TODO Auto-generated method stub
		/*
		 * Conexao com o banco
		 */
		EntityManager entityManager = new JPAUtil().getEntityManager();

		/*
		 *  Fazendo a busca no banco de dados
		 */
		Categoria categoria1 = entityManager.getReference( Categoria.class, 2L );
		Categoria categoria2 = entityManager.find( Categoria.class, 3L );

		/*
		 * Removendo a pessoa
		 */
		entityManager.getTransaction().begin();
		entityManager.remove( categoria1 );
		entityManager.remove( categoria2 );
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
