package com.mph.dao;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mph.entity.Register;
/**
*
* @author Sonal Ambhore
*/
@Repository
public class RegisterDaoImpl implements RegisterDao {
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createRegister(Register register) {
		getSession().saveOrUpdate(register);
		System.out.println("Registraition Saved successfully...");
		/**
	     * Using standard output stream
	     * for giving the output.
	     * @return registered customer details
	     */
	}
	@Override
	public List<Register> getAllRegister() {
		Query qry = getSession().createQuery("select e from Register e");
		List<Register> reglist = qry.list();
		System.out.println("reg list from dao : " + reglist);
		return reglist;
		/**
	     * Using standard output stream
	     * for giving the output.
	     * @return null
	     */
	}
	@Override
	public Register getRegister(Register reg) {
		return null;
	}
	@Override
	public List<Register> updateRegister(Register register) {
		Query qry = getSession()
				.createQuery(" update Register  e set firstname=:firstname,lastname=:lastname,username=:username,city=:city,state=:state,zip=:zip,mobileno=:mobileno,distributername=:distributername where rid=:rid");
	
		qry.setParameter("firstname", register.getFirstname());
		qry.setParameter("lastname", register.getLastname());
		qry.setParameter("username", register.getUsername());
		qry.setParameter("city", register.getCity());
		qry.setParameter("state", register.getState());
		qry.setParameter("zip", register.getZip());
		qry.setParameter("mobileno", register.getMobileno());
		qry.setParameter("distributername", register.getDistributername());
		qry.setParameter("rid", register.getRid());
		
		
		
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllRegister();
		
	}
	/**
     * Using standard output stream
     * for giving the output.
     * @return all registered customer list
     */

	@Override
	public List<Register> deleteRegister(int rid) {
		Query qry = getSession().createQuery(" delete Register  e where rid=:rid");
		qry.setParameter("rid", rid);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return getAllRegister();
	}
	@Override
	public Register getRegister(int id) {
		Query qry = getSession().createQuery("from Register e where rid=:id");
		qry.setParameter("id", id);
		Register reg = (Register) qry.uniqueResult();
		System.out.println("search result : " + reg);
		return reg;
	}
	/**
	 * Some description here.
	 *
	 * @version JDK 11.0.1
	 */
	

}