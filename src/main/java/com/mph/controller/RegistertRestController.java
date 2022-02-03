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


import com.mph.entity.Register;

import com.mph.service.RegisterService;
@RestController
@RequestMapping("/register")
@CrossOrigin(allowCredentials = "true",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
/**
*
* @author Susmita Selokar
*/
public class RegistertRestController {
	/**
	    * This is a program for adding details of customer.
	        * @param args
	    */
	@Autowired
	public RegisterService registerService;
	/**
     * Using standard output stream
     * for giving the output.
     * @return customer details
     */

	@GetMapping("/allreg")
	public ResponseEntity<List<Register>> listAllRegister() {
		List<Register> li = registerService.getAllRegister();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Register>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Register>>(li,HttpStatus.OK);
	}
	/**
     * Using standard output stream
     * for giving the output.
     * @return updated data for customer
     */
	@PostMapping("/createReg")
	public Register createRegister(@RequestBody Register register) {
		registerService.createRegister(register);
		return register;
	}
	@DeleteMapping("/deleteReg/{rid}")
	public ResponseEntity<List<Register>> deleteRegister(@PathVariable("rid") int rid) {
		List<Register> li = registerService.deleteRegister(rid);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Register>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Register>>(li,HttpStatus.OK);
	}
	@PutMapping("/updateReg")
	public ResponseEntity<List<Register>> updateRegister(@RequestBody Register register) {
		List<Register> li = registerService.updateRegister(register);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Register>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Register>>(li,HttpStatus.OK);
	}
	@GetMapping("/getreg/{rid}")
    public ResponseEntity<Register> getRegister(@PathVariable("rid") int id) {
        
		Register register = registerService.getRegister(id);
    	if (register == null) {
			return new ResponseEntity<Register>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Register>(register,HttpStatus.OK);
    }
	/**
	 * Some description here.
	 *
	 * @version JDK 11.0.1
	 */
	
	
}