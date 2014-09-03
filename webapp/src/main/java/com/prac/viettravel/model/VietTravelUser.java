package com.prac.viettravel.model;

import javax.persistence.DiscriminatorValue;

import com.prac.core.model.Address;
import com.prac.core.model.User;

@DiscriminatorValue(value = "1")
public class VietTravelUser extends User {
	/** */
	private static final long serialVersionUID = 5780366845628089808L;
	private Address address;

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

}
