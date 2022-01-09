package com.paypal.bfs.test.bookingserv.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.paypal.bfs.test.bookingserv.api.entity.BookingEntity;
import com.paypal.bfs.test.bookingserv.api.model.Booking;

public interface BookingResource {
    /**
     * Create {@link Booking} resource
     *
     * @param booking the booking object
     * @return the created booking
     * @throws MethodArgumentNotValidException 
     */
    @RequestMapping(value = "/v1/bfs/booking", method = RequestMethod.POST)
    ResponseEntity<BookingEntity> create(@Valid @RequestBody BookingEntity booking) throws MethodArgumentNotValidException;

    // ----------------------------------------------------------
    // TODO - add a new operation for Get All the bookings resource.
    // ----------------------------------------------------------
    @RequestMapping(value = "/v1/bfs/booking", method = RequestMethod.GET)
    ResponseEntity<List<BookingEntity>> getAll();
}
