package com.paypal.bfs.test.bookingserv.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.bfs.test.bookingserv.api.BookingResource;
import com.paypal.bfs.test.bookingserv.api.entity.BookingEntity;
import com.paypal.bfs.test.bookingserv.service.BookingService;

@RestController
public class BookingResourceImpl implements BookingResource {

 @Autowired
 private BookingService bookingService;

	@Override
	public ResponseEntity<BookingEntity> create(BookingEntity booking) throws MethodArgumentNotValidException{
		
		return new ResponseEntity<BookingEntity>(bookingService.save(booking), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<BookingEntity>> getAll() {
		return new ResponseEntity<List<BookingEntity>>(bookingService.getAll(),HttpStatus.OK);
	}
}
