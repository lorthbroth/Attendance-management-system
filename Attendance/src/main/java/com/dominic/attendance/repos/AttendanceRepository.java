package com.dominic.attendance.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.dominic.attendance.entities.Venue;

public interface AttendanceRepository extends JpaRepository<Venue, Integer> {

	Venue findOne(int id);
}
