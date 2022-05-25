package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetCompany {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Gst gst = entityManager.find(Gst.class, 1);
		if (gst != null) {
			System.out.println(" ");
			System.out.println("GST Num " + gst.getGstNumber());
			System.out.println("State " + gst.getState());
			System.out.println("Country " + gst.getCountry());

			Company company = gst.getCompany();
			System.out.println("Company Name " + company.getName());
			System.out.println("website " + company.getWebsite());
		} else {
			System.out.println("No Gst exists for Given Id");
		}

	}

}
