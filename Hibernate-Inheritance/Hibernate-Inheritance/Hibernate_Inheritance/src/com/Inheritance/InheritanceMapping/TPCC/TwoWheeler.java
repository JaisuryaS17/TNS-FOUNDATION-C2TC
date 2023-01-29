package com.Inheritance.InheritanceMapping.TPCC;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Deepak
 *
 */
@Entity
@Table(name = "TPCC_TWO_WHEELER")
@AttributeOverrides( 
	@AttributeOverride(name = "vehicleName", column = @Column(name = "VEHICLE_NAME")) )
public class TwoWheeler extends Vehicle {

	@Column(name = "Bike")
	private String bikeName;

	
	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public TwoWheeler(String vehicleName,String bikeName) {
		super(vehicleName);
		this.bikeName=bikeName;
	}

	public TwoWheeler() {
		super();
	}
}
