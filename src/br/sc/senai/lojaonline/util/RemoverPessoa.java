package br.sc.senai.lojaonline.util;

import javax.persistence.EntityManager;

import br.sc.senai.lojaonline.model.Pessoa;

public class RemoverPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager entityManager = new JPAUtil().getEntityManager();

		Pessoa pessoa = entityManager.getReference(Pessoa.class, 3L);

		entityManager.getTransaction().begin();
		entityManager.remove(pessoa);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
