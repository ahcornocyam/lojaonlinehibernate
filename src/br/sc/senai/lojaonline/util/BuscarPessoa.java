package br.sc.senai.lojaonline.util;

import javax.persistence.EntityManager;

import br.sc.senai.lojaonline.model.Pessoa;

public class BuscarPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager entityManager = new
				JPAUtil().getEntityManager();

		Pessoa pessoa = entityManager.find(Pessoa.class, 3L);

		System.out.println("Id: "+pessoa.getId());

		System.out.println("Nome: "+pessoa.getNome());

		System.out.println("Documento: "+pessoa.getDocumento());

		entityManager.close();

	}

}
