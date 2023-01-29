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
@Table(name = "TCP_FOUR_WHEELER")
@DiscriminatorValue("Car")
public class FourWheeler extends Vehicle {

	@Column(name = "Car")
	private String carName;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public FourWheeler(String vehicleName, String carName) {
		super(vehicleName);
		this.carName = carName;
	}
}
