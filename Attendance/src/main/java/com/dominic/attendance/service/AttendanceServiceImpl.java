package com.dominic.attendance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dominic.attendance.entities.Venue;
import com.dominic.attendance.repos.AttendanceRepository;

@Service
public class AttendanceServiceImpl implements AttendanceService {

	@Autowired
	private AttendanceRepository repository;

	@Override
	public Venue saveVenue(Venue venue) {
		return repository.save(venue);
	}

	@Override
	public Venue updateVenue(Venue venue) {
		return repository.save(venue);
	}

	@Override
	public void deleteVenue(Venue venue) {
		repository.delete(venue);
	}

	@Override
	public Venue getVenueById(int Id) {
		return (Venue) repository.findOne(Id);
	}

	@Override
	public List<Venue> getAllVenue() {
		return repository.findAll();
	}

	public AttendanceRepository getRepository() {
		return repository;
	}

	public void setRepository(AttendanceRepository repository) {
		this.repository = repository;
	}

}
