package com.spring.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;


@Repository
@Transactional
public class PersonService {
	@Autowired
	HibernateTemplate htemp;

	public void addperson(Personalinformation personalinformation) {
		htemp.save(personalinformation);
		System.out.println("Hello Java");
	}

}
