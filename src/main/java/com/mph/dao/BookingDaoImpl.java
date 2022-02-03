package com.mph.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Booking;



@Repository
/**
*
* @author Srish R K
*/
public class BookingDaoImpl implements BookingDao {
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}


	@Override
	public void createBooking(Booking booking) {
		getSession().saveOrUpdate(booking);
		System.out.println("Booking Saved successfully...");
		
	}
	/**
     * Using standard output stream
     * for giving the output.
     * @return booking customer list
     */

	@Override
	public List<Booking> getAllBooking() {
		Query qry = getSession().createQuery("select e from Booking e");
		List<Booking> booklist = qry.list();
		System.out.println("book list from dao : " + booklist);
		return booklist;
	}
	/**
     * Using standard output stream
     * for giving the output.
     * @return null
     */

	@Override
	public Booking getBooking(Booking book) {
		Criteria c = getSession().createCriteria(Booking.class);
		c.add(Restrictions.eq("mail", book.getMail()));
		Booking bookin = (Booking) c.uniqueResult();
		return bookin;
	}
	/**
     * Using standard output stream
     * for giving the output.
     * @return  all booking list
     */

	@Override
	public List<Booking> updateBooking(Booking booking) {
		Query qry = getSession()
				.createQuery(" update Booking  e set ctype=:ctype,cname=:cname,mail=:mail,noofcylinders=:noofcylinders,city=:city where bid=:bid");
		qry.setParameter("ctype", booking.getCtype());
		qry.setParameter("cname", booking.getCname());
		qry.setParameter("mail", booking.getMail());
		qry.setParameter("noofcylinders", booking.getNoofcylinders());
		qry.setParameter("city", booking.getCity());
		qry.setParameter("bid", booking.getBid());
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllBooking();
	}
	/**
     * Using standard output stream
     * for giving the output.
     * @return  all booking list
     */

	@Override
	public List<Booking> deleteBooking(int bid) {
		Query qry = getSession().createQuery(" delete Booking  e where bid=:bid");
		qry.setParameter("bid", bid);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return getAllBooking();
	}


	@Override
	public Booking getBooking(int id) {
		Query qry = getSession().createQuery("from Booking e where bid=:id");
		qry.setParameter("id", id);
		Booking book = (Booking) qry.uniqueResult();
		System.out.println("search result : " + book);
		return book;
	}
	/**
	 * Some description here.
	 *
	 * @version JDK 11.0.1
	 */
	}

