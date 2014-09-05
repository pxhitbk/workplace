package com.prac.viettravel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.prac.core.model.BaseEntity;

@Entity
@Table(name = "prac_web_travelserviceprovider")
public class TravelServiceProvider extends BaseEntity {
	/** */
	private static final long serialVersionUID = -433049142628583980L;
	@Column(insertable = false, updatable = false)
	private Long providerId;
	@ManyToOne
	@JoinColumn(name = "providerId")
	private ServiceProvider provider;

	@Column(insertable = false, updatable = false)
	private Long serviceId;
	@ManyToOne
	@JoinColumn(name = "serviceId")
	private TravelService service;

	private Long quantity;
	private Double price;

	public TravelServiceProvider(final ServiceProvider serviceProvider, final TravelService travelService) {
		provider = serviceProvider;
		service = travelService;
	}

	public void setProvider(ServiceProvider provider) {
		this.provider = provider;
	}

	public void setService(TravelService service) {
		this.service = service;
	}

	public ServiceProvider getProvider() {
		return provider;
	}

	public TravelService getService() {
		return service;
	}

	public Long getProviderId() {
		return providerId;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}
