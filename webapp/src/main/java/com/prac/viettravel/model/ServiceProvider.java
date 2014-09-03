package com.prac.viettravel.model;

import javax.persistence.Entity;

import com.prac.core.model.Address;
import com.prac.core.model.BaseEntity;

@Entity
public class ServiceProvider extends BaseEntity {
	/** */
	private static final long serialVersionUID = 5255232637359839446L;
	private String name;
	private Address address;
}
