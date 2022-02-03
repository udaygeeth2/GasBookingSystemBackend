package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Booking;

import com.mph.service.BookingService;


@RestController
@RequestMapping("/booking")
@CrossOrigin(allowCredentials = "true",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
/**
*
* @author Thirumalai K
*/
public class BookingRestcontroller {
	/**
	    * This is a program for adding booking details of customer.
	         *@param args
	    */
	
	@Autowired
	public BookingService bookingService;
	
	@GetMapping("/allbook")
	public ResponseEntity<List<Booking>> listAllBooking() {
		List<Booking> li = bookingService.getAllBooking();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Booking>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Booking>>(li,HttpStatus.OK);
	}
	/**
     * Using standard output stream
     * for giving the output.
     * @return booking details
     */
	
	@PostMapping("/createBook")
	public Booking createBooking(@RequestBody Booking booking) {
		bookingService.createBooking(booking);
		return booking;
	}
	@DeleteMapping("/deleteEmp/{id}")
	public ResponseEntity<List<Booking>> deleteBooking(@PathVariable("id") int bid) {
		List<Booking> li = bookingService.deleteBooking(bid);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Booking>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Booking>>(li,HttpStatus.OK);
	}
	/**
     * Using standard output stream
     * for giving the output.
     * @return updated data for booking
     */
	
	@PutMapping("/updateBook")
	public ResponseEntity<List<Booking>> updateBooking(@RequestBody Booking booking) {
		List<Booking> li = bookingService.updateBooking(booking);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Booking>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Booking>>(li,HttpStatus.OK);
	}
	@GetMapping("/getBook/{bid}")
    public ResponseEntity<Booking> getEmployee(@PathVariable("bid") int id) {
        
		Booking booking = bookingService.getBooking(id);
    	if (booking == null) {
			return new ResponseEntity<Booking>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Booking>(booking,HttpStatus.OK);
    }
	/**
	 * Some description here.
	 *
	 * @version JDK 11.0.1
	 */

}