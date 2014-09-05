package com.prac.viettravel.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.prac.core.model.Address;
import com.prac.core.model.BaseEntity;

@Entity
@DiscriminatorColumn(name = "ptype", discriminatorType = DiscriminatorType.INTEGER)
@Table(name = "prac_web_serviceprovider")
public class ServiceProvider extends BaseEntity {
	/** */
	private static final long serialVersionUID = 5255232637359839446L;
	private String name;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
