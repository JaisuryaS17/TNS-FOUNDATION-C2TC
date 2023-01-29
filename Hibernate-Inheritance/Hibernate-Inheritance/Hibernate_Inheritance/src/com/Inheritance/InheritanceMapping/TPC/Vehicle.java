package com.Inheritance.InheritanceMapping.TPC;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;

/**
 * @author Deepak
 *
 */
@Entity
@Table(name = "TPC_VEHICLE")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Least normalisation strategy
@DiscriminatorColumn(name = "VEHICLE_TYPE", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Vehicle Company")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "VEHICLE_ID")
	private int vehicleId;

	@Column(name = "VEHICLE_NAME")
	private String vehicleName;

	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
}
