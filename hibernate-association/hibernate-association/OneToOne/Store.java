package OneToOne;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Store {

	public static void main(String[] args) {  
	    
		Session session=new AnnotationConfiguration().configure("OneToOne/hibernate.cfg.xml").buildSessionFactory().openSession();  
	    
		Transaction tx=session.beginTransaction();  
	      
	    Employee e1=new Employee();  
	    e1.setName("prakash deshmukh");  
	    e1.setEmail("pd123@gmail.com");  
	      
	    Address address1=new Address();  
	    address1.setAddressLine1("b.no-212,main street");  
	    address1.setCity("pune");  
	    address1.setState("Maharashtra");  
	    address1.setCountry("India");  
	    address1.setPincode(411004);  
	      
	      
	    e1.setAddress(address1);  
	    address1.setEmployee(e1);  
	      
	    session.persist(e1);  
	    tx.commit();  
	      
	    session.close();  
	    System.out.println("success");  
	}  
}
