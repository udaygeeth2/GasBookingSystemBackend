package com.mph.service;

import java.util.List;

import com.mph.entity.Booking;

public interface BookingService {
	

	public void createBooking(Booking booking);
	public List<Booking> getAllBooking();
	public Booking getBooking(Booking book);
	public List<Booking> updateBooking(Booking booking);
	public List<Booking> deleteBooking(int bid);
	public  Booking getBooking(int id);
}

