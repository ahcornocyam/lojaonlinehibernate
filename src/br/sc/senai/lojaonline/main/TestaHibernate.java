package br.sc.senai.lojaonline.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.EntityManager;

import br.sc.senai.lojaonline.model.Pessoa;
import br.sc.senai.lojaonline.util.JPAUtil;

public class TestaHibernate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		new JPAUtil().getEntityManager();

		SimpleDateFormat formatar = new SimpleDateFormat("dd/mm/yyyy");

		Pessoa pessoa  =  new Pessoa();

		pessoa.setNome("Maycon");
		pessoa.setDocumento("121.345.677");
		pessoa.setDataDeNascimento(formatar.parse("13/04/1985"));

		JPAUtil jpautil =  new JPAUtil();
		EntityManager entityManager = jpautil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(pessoa);
		entityManager.getTransaction().commit();
		entityManager.close();

	}
}