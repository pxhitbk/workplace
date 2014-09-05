package com.prac.viettravel.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "prac-web-tour")
public class Tour {
	private String name;
	private long duration;
	private Date startDate;
	private Date endDate;
	private Date startBookingDate;
	private Date endBookingDate;
	private long maxAllowedCustomer;
	private boolean isInternational;
	private boolean isAvailable;

	public Tour() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartBookingDate() {
		return startBookingDate;
	}

	public void setStartBookingDate(Date startBookingDate) {
		this.startBookingDate = startBookingDate;
	}

	public Date getEndBookingDate() {
		return endBookingDate;
	}

	public void setEndBookingDate(Date endBookingDate) {
		this.endBookingDate = endBookingDate;
	}

	public long getMaxAllowedCustomer() {
		return maxAllowedCustomer;
	}

	public void setMaxAllowedCustomer(long maxAllowedCustomer) {
		this.maxAllowedCustomer = maxAllowedCustomer;
	}

	public boolean isInternational() {
		return isInternational;
	}

	public void setInternational(boolean isInternational) {
		this.isInternational = isInternational;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
