package br.sc.senai.lojaonline.main;

import javax.persistence.EntityManager;

import br.sc.senai.lojaonline.model.Categoria;
import br.sc.senai.lojaonline.util.JPAUtil;

public class Buscar {

	public static void main( String[] args ) {
		// TODO Auto-generated method stub
		/*
		 * Conexao com o banco
		 */
		EntityManager entityManager = new JPAUtil().getEntityManager();

		//Fazendo a busca no banco de dados
		Categoria categoria = entityManager.find( Categoria.class, 1L );

		// Mostrando os dados buscado do banco de dados
		System.out.println( "Id: " + categoria.getId() ) ;
		System.out.println( "Nome: " + categoria.getNome() );
		entityManager.close();

	}

}
