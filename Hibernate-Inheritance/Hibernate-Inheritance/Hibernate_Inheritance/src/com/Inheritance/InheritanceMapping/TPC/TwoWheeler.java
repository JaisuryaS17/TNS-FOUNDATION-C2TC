package com.Inheritance.InheritanceMapping.TPC;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Deepak
 *
 */
@Entity
@Table(name = "TCP_TWO_WHEELER")
@DiscriminatorValue("Bike")
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
