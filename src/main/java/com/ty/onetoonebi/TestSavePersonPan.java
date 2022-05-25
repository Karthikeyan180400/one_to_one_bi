package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person = new Person();
		person.setName("Peter");
		person.setEmail("peter@email.com");
		person.setPhone(81155777);
		
		Pan pan = new Pan();
		pan.setName("Peter Alpha");
		pan.setPanNumber("FO33P700");
		pan.setAddress("5th Street,Madurai");
		
		person.setPan(pan);
		pan.setPerson(person);
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit();

	}

}
