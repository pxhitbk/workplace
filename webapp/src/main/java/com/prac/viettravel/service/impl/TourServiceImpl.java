package com.prac.viettravel.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.prac.service.GenericDao;
import com.prac.util.ServiceResolver;
import com.prac.viettravel.model.Tour;
import com.prac.viettravel.service.TourService;

public class TourServiceImpl implements TourService {

	private static final Logger LOGGER = LoggerFactory.getLogger(TourServiceImpl.class);

	@Override
	public int createTours(List<Tour> newTours) {
		if (newTours == null || newTours.isEmpty())
			return 0;
		GenericDao core = ServiceResolver.findService(GenericDao.class);
		List<Long> addedTours = new ArrayList<>();
		Tour successTour;
		for (Tour tour : newTours) {
			try {
				successTour = core.insert(tour);
				addedTours.add(tour.getId());
				LOGGER.info("Success added tour " + successTour.getName());
			} catch (Exception e) {
				LOGGER.error("Cannot add tour " + tour.getName(), e);
			}
		}
		return addedTours.size();
	}

}
