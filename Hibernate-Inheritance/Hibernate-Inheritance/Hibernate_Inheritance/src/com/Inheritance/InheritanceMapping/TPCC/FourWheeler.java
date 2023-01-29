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
@Table(name = "TPCC_FOUR_WHEELER")
@AttributeOverrides(
	@AttributeOverride(name = "vehicleName", column = @Column(name = "VEHICLE_NAME")) )
public class FourWheeler extends Vehicle {
	public FourWheeler() {
		super();
	}

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
