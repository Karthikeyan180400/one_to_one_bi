package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPerson {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 2);
		if (person != null) {
			System.out.println("Name " + person.getName());
			System.out.println("Email " + person.getEmail());
			System.out.println("Phone num " + person.getPhone());

			Pan pan = person.getPan();
			System.out.println("Pan Num " + pan.getPanNumber());
			System.out.println("Address " + pan.getAddress());
		} else {
			System.out.println("No person exists for given id");
		}

	}

}
