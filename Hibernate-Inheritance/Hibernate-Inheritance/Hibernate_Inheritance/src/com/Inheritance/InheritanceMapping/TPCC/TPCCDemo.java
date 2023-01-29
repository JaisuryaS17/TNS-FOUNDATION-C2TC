package com.Inheritance.InheritanceMapping.TPCC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class TPCCDemo {
	public static void main(String[] args) {

		SessionFactory sessionFactory = new AnnotationConfiguration().configure("hibernateTPCC.cfg.xml")
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		/*Vehicle vehicle = new Vehicle("Suzuki");
		vehicle.setVehicleId(1);*/

		TwoWheeler twoWheeler = new TwoWheeler("Suzuki Brand", "Suzuki Bike");
		twoWheeler.setVehicleId(2);

		FourWheeler fourWheeler = new FourWheeler("Suzuki Brand", "Suzuki Car");
		fourWheeler.setVehicleId(3);

		//session.save(vehicle);
		session.save(twoWheeler);
		session.save(fourWheeler);

		session.getTransaction().commit();
		session.close();
	}
}
