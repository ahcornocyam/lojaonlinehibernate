package br.sc.senai.lojaonline.util;

import java.text.ParseException;

import javax.persistence.EntityManager;

import br.sc.senai.lojaonline.model.Categoria;
import br.sc.senai.lojaonline.model.Pessoa;

public class AtualizarPessoa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		EntityManager entityManager= new JPAUtil().getEntityManager();

		Pessoa pessoa = entityManager.find(Pessoa.class, 1L);
		pessoa.setNome("Alexandre Roch");
		entityManager.getTransaction().begin();
		entityManager.merge(pessoa);
		entityManager.getTransaction().commit();

		Categoria categoria =  entityManager.find(Categoria.class, 1L);
		categoria.setNome("Automovel");
		entityManager.getTransaction().begin();
		entityManager.merge(categoria);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
