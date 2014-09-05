package com.prac.viettravel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="prac-web-room")
public class Room {
	private String name;
	private int numberOfBeds;

	@Column(insertable = false, updatable = false)
	private long providerId;
	@ManyToOne
	@JoinColumn(name = "providerId")
	private RoomServiceProvider roomServiceProvider;

	public Room() {
	}

	public Room(RoomServiceProvider roomServiceProvider) {
		this.roomServiceProvider = roomServiceProvider;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	public long getProviderId() {
		return providerId;
	}

	public void setRoomServiceProvider(RoomServiceProvider roomServiceProvider) {
		this.roomServiceProvider = roomServiceProvider;
	}
}
