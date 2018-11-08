package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
	
		Address address=em.find(Address.class, 1);
		//System.out.println(address.getStreet()+"\t"+address.getState()+"\t"+address.getState()+"\t"+address.getZipCode());
		Student student= em.find(Student.class, 2);
		System.out.println(student.getName()+student.getStudentId()+student.getAddress().getAddressId()+student.getAddress().getStreet()+student.getAddress().getCity()+student.getAddress().getState());
	em.close();
	factory.close();
	}

}
