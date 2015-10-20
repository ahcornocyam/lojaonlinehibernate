package br.sc.senai.lojaonline.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAUtil {

	private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("LojaOnlinePU");

	public EntityManager getEntityManager(){
		return factory.createEntityManager();
	}
}
