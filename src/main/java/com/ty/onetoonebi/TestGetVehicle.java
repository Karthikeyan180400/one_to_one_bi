package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVehicle {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Vehicle vehicle = entityManager.find(Vehicle.class, 1);
		if (vehicle != null) {
			System.out.println("ID: " + vehicle.getId());
			System.out.println("Name: " + vehicle.getName());
			System.out.println("Cost: " + vehicle.getCost());
			Charcy charcy = vehicle.getCharcy();
			System.out.println("--------------------------------");
			System.out.println("Charcy Id: " + charcy.getId());
			System.out.println("CharcyNumber: " + charcy.getCharcyNumber());
			System.out.println("Charcy Type: " + charcy.getType());

		} else {
			System.out.println("No Vehicle Exists for given ID");
		}

	}

}
