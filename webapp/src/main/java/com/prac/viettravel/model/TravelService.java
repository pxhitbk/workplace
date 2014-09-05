package com.prac.viettravel.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.prac.core.model.BaseEntity;

@Entity
@Table(name = "prac_web_travelservice")
public class TravelService extends BaseEntity {

	/** */
	private static final long serialVersionUID = -4187227937787002581L;

	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
