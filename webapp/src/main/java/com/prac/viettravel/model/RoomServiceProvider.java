package com.prac.viettravel.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value = "1")
public class RoomServiceProvider extends ServiceProvider {

	/** */
	private static final long serialVersionUID = 5328279985392044673L;

	private RoomServiceProviderType providerType;

	@OneToMany(mappedBy = "roomServiceProvider")
	private List<Room> rooms;

	public RoomServiceProviderType getProviderType() {
		return providerType;
	}

	public void setProviderType(RoomServiceProviderType providerType) {
		this.providerType = providerType;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
}
