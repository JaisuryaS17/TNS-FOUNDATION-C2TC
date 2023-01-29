package com.Inheritance.InheritanceMapping.TPSC;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TPSC_TWO_WHEELER")
@PrimaryKeyJoinColumn(name = "VEHICLE_ID_Fk")
public class TwoWheeler extends Vehicle {
	@Column(name = "Bike")
	private String bikeName;

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public TwoWheeler(String vehicleName, String bikeName) {
		super(vehicleName);
		this.bikeName = bikeName;
	}
}
