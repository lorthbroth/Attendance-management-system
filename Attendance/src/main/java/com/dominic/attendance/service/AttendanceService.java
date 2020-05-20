package com.dominic.attendance.service;

import java.util.List;

import com.dominic.attendance.entities.Venue;

public interface AttendanceService {

	Venue saveVenue(Venue venue);

	Venue updateVenue(Venue venue);

	void deleteVenue(Venue venue);

	Venue getVenueById(int Id);

	List<Venue> getAllVenue();

}
