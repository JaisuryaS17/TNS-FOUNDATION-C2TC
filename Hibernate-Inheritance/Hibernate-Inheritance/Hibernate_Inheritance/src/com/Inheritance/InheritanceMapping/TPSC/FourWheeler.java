package com.Inheritance.InheritanceMapping.TPSC;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @author Deepak
 *
 */
@Entity
@Table(name = "TPSC_FOUR_WHEELER")
@PrimaryKeyJoinColumn(name = "VEHICLE_ID_FK")
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
