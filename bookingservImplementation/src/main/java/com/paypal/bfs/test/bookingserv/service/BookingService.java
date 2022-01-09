/**
 * 
 */
package com.paypal.bfs.test.bookingserv.service;

import java.util.List;

import com.paypal.bfs.test.bookingserv.api.entity.BookingEntity;

/**
 * @author ANKIT  RATHOD
 *
 */
public interface BookingService {

	BookingEntity save(BookingEntity booking);
	List<BookingEntity> getAll();
}
