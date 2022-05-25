package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleCharcy {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Vehicle vehicle = new Vehicle();
		vehicle.setName("Peter");
		vehicle.setCost(90000);

		Charcy charcy = new Charcy();
		charcy.setCharcyNumber("INDCH1234556");
		charcy.setType("OnRoad");
		charcy.setVehicle(vehicle);
		vehicle.setCharcy(charcy);

		entityTransaction.begin();
		// entityManager.persist(vehicle);
		entityManager.persist(charcy);
		entityTransaction.commit();

	}

}
