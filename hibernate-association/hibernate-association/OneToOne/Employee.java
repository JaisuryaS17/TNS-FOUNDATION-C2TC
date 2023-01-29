package OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employe")
public class Employee {

	private int employeeId;  
	private String name,email;  
	private Address address;
	
	@Id
	@GeneratedValue
	@Column(name="eid")
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@OneToOne(cascade= CascadeType.ALL)
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}  
	
	
}
