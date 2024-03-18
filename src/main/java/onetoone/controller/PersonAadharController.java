package onetoone.controller;

import javax.persistence.EntityManager;


import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone.dao.AadharCardDao;
import onetoone.dao.PersonDao;
import onetoone.dto.Aadharcard;
import onetoone.dto.Person;


public class PersonAadharController {

	public static void main(String[] args) {
		
		Person person= new Person();
		person.setId(301);
		person.setName("Revan V shaha");
		person.setAddress("Amravati");
		
		Aadharcard aadharcard=new Aadharcard();
		aadharcard.setId(1550);
		aadharcard.setName("R Vinod");
		aadharcard.setAge(20);
		
		person.setAadharcard(aadharcard);
		PersonDao personDao=new PersonDao();
		
		personDao.deletePerson(301);
		
	personDao.updatePerson(301, person);

//		//save
//		
//		Person person= new Person();
//		person.setId(301);
//		person.setName("Pooja za");
//		person.setAddress("Bmaglore");
//		
//		PersonDao personDao= new PersonDao();
//		personDao.savaPerson(person);
////		
////		
//		Aadharcard aadharCard=new Aadharcard();
//		aadharCard.setId(3302);
//		aadharCard.setName(" Pooja K Zha");
//		aadharCard.setAge(28);
//		
//		AadharCardDao aadharCardDao=new AadharCardDao();
//		aadharCardDao.saveAadharCard(301, aadharCard);
////		
//		personDao.deletePerson(115);
//	
//		
//		
//		//find
//////		
////		PersonDao personDao=new PersonDao();
////		personDao.findPerson(1);
////		
////		AadharCardDao aadharCardDao=new AadharCardDao();
////		aadharCardDao.findAadharCard(100);
////		
//		
////		delete
//		
////		AadharCardDao aadharCardDao=new AadharCardDao();
////		aadharCardDao.deleteAadharCard(101);
////		
////		PersonDao personDao= new PersonDao();
////		personDao.deletePerson(1);
//////		
//		
//		
//		//update
//		
//		
////		Aadharcard aadharCard=new Aadharcard();	
////		aadharCard.setName("Abhkiesh Varma");
////		aadharCard.setAge(35);
////		
////		AadharCardDao aadharCardDao=new AadharCardDao();
////		aadharCardDao.updateAadharCard(104,aadharCard );
////		
////		
////		Person person=new Person();
////		person.setName("Abhi");
////		person.setAddress("Bangalore");
////		
////		
////		PersonDao personDao=new PersonDao();
////		personDao.updatePerson(4,person);
////		
//	}
//	
////	
//	
//	
//
//	
//	
//	}
//
//
		
	}
}
