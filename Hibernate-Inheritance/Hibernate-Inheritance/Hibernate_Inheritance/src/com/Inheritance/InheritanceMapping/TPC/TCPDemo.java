package com.Inheritance.InheritanceMapping.TPC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TCPDemo {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernateTPC.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Vehicle vehicle = new Vehicle("Mahindra");

		TwoWheeler twoWheeler = new TwoWheeler("Mahindra", "Mahindra Bike");

		FourWheeler fourWheeler = new FourWheeler("Mahindra", "Mahindra Car");

		session.save(vehicle);
		session.save(twoWheeler);
		session.save(fourWheeler);

		session.getTransaction().commit();
		session.close();
	}
}
