package com.prac.viettravel.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="prac-web-travelserviceprovider")
public class TravelServiceProvider {
	private Long providerId;
	@OneToMany(mappedBy = "providerId")
	private ServiceProvider provider;

	private Long serviceId;
	@OneToMany(mappedBy = "serviceId")
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
