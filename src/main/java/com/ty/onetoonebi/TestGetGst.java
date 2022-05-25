package com.ty.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetGst {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Company company = entityManager.find(Company.class, 2);
		if (company != null) {
			System.out.println(" ");
			System.out.println("Company Name " + company.getName());
			System.out.println("website " + company.getWebsite());

			Gst gst = company.getGst();
			System.out.println("GST Num " + gst.getGstNumber());
			System.out.println("State " + gst.getState());
			System.out.println("Country " + gst.getCountry());
		} else {
			System.out.println("No Company Exists for Given Id");
		}

	}

}
