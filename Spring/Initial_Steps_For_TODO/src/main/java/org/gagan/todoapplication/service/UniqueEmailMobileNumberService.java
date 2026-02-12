package org.gagan.todoapplication.service;

import org.gagan.todoapplication.repository.UniqueEmailMobileNumber;
import org.springframework.stereotype.Service;


@Service
public class UniqueEmailMobileNumberService {
	UniqueEmailMobileNumber uniqueEmailMobileNumber;
	
	public UniqueEmailMobileNumberService(UniqueEmailMobileNumber uniqueEmailMobileNumber) {
		this.uniqueEmailMobileNumber=uniqueEmailMobileNumber;
	}
	
	
	public void uniqueEmailMobile(String email, String mobilenumber) {
	   	if (uniqueEmailMobileNumber.existsByEmail(email)) {
		    throw new RuntimeException("Email already registered");
		}
		if(uniqueEmailMobileNumber.existsByMobileNumber(mobilenumber)) {
			throw new RuntimeException("Mobile Number already registered");
		}
	}
	

}
