package com.prac.viettravel.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.prac.util.ServiceResolver;
import com.prac.viettravel.model.Tour;
import com.prac.viettravel.service.TourService;
import com.prac.viettravel.service.WebappService;

public class WebAppServiceImpl implements WebappService {

	public WebAppServiceImpl() {
		createTestData();
	}

	@Override
	public void createTestData() {
		createTourService();
	}

	private void createTourService() {

		String[] tourName = { "Lang Co resort in 7 days", "Travel to Mongol with free transportation",
				"Big Summer with DaNang, only 200$ for 5 days", "To your dream in DaLat with many sale off offerring" };
		List<Tour> tours = new ArrayList<Tour>();
		for (String element : tourName) {
			Tour t = new Tour();
			t.setName(element);
			tours.add(t);
		}

		ServiceResolver.findService(TourService.class).createTours(tours);
	}
}
