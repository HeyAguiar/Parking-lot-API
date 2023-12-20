package com.gui.apiparkinglot.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gui.apiparkinglot.model.ParkingSpotModel;

public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

	boolean existsByLicensePlateCar(String licensePlateCar);
	boolean existsByParkingSpotNumber(String parkingSpotNumber);
	boolean exitsByApartmentAndBlock(String apartment, String block);
}
