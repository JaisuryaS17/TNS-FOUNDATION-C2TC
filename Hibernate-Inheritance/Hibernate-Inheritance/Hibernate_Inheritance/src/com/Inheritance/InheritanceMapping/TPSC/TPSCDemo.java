package com.Inheritance.InheritanceMapping.TPSC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TPSCDemo {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernateTPSC.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Vehicle vehicle = new Vehicle("Hundai");
		//vehicle.setVehicleId(1);

		TwoWheeler twoWheeler = new TwoWheeler("Hundai", "Hundai Bike");
		//twoWheeler.setVehicleId(2);

		FourWheeler fourWheeler = new FourWheeler("Hundai", "Hundai Car");
		//fourWheeler.setVehicleId(3);

		session.save(vehicle);
		session.save(twoWheeler);
		session.save(fourWheeler);

		session.getTransaction().commit();
		session.close();
	}
}
