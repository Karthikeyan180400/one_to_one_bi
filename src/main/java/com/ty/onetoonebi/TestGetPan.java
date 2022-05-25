package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Pan pan = entityManager.find(Pan.class, 5);
		if (pan != null) {
			System.out.println("Pan Number " + pan.getPanNumber());
			System.out.println("Address " + pan.getAddress());

			Person person = pan.getPerson();
			System.out.println("Name " + person.getName());
			System.out.println("Email " + person.getEmail());
			System.out.println("Phone " + person.getPhone());
		} else {
			System.out.println("No Pan exists for given Id");
		}

	}

}
