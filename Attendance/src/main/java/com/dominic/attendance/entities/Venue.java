package com.dominic.attendance.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Venue {
	
	@Id
	private int roomid;
	private String code;
	private String department;
	private int capacity;

	public int getRoomid() {
		return roomid;
	}

	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Venue [roomid=" + roomid + ", code=" + code + ", department=" + department + ", capacity=" + capacity
				+ "]";
	}
}
