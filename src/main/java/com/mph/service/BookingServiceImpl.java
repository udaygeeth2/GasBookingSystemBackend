package com.mph.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.BookingDao;

import com.mph.entity.Booking;
/**
*
* @author Kiran savarapu
*/
@Service
@Transactional
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	public BookingDao bookingDao;
	


	@Override
	public void createBooking(Booking booking) {
		bookingDao.createBooking(booking);
		
	}

	@Override
	public List<Booking> getAllBooking() {
		return bookingDao.getAllBooking();
	}

	@Override
	public Booking getBooking(Booking book) {
		return bookingDao.getBooking(book);
	}

	@Override
	public List<Booking> updateBooking(Booking booking) {
		return bookingDao.updateBooking(booking);
	}


	@Override
	public List<Booking> deleteBooking(int bid) {
		return bookingDao.deleteBooking(bid);
	}

	@Override
	public Booking getBooking(int id) {
		return bookingDao.getBooking(id);
	}

}