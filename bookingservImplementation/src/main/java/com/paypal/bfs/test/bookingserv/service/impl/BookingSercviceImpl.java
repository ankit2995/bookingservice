/**
 * 
 */
package com.paypal.bfs.test.bookingserv.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.bfs.test.bookingserv.api.entity.BookingEntity;
import com.paypal.bfs.test.bookingserv.repository.BookingRepository;
import com.paypal.bfs.test.bookingserv.service.BookingService;

/**
 * @author ANKIT  RATHOD
 *
 */
@Service
public class BookingSercviceImpl implements BookingService{
	
	@Autowired
	private BookingRepository bookingRepo;
	@Override
	public BookingEntity save(BookingEntity booking) {
		return bookingRepo.save(booking);
	}

	@Override
	public List<BookingEntity> getAll() {
		return bookingRepo.findAll();
	}

}
