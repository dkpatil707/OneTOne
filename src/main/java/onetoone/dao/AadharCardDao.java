package onetoone.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone.dto.Person;
import onetoone.dto.Aadharcard;


public class AadharCardDao {
	
	public void saveAadharCard(int personId, Aadharcard aadharCard) {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Person dbPerson=entityManager.find(Person.class, personId);
	
	
	if(dbPerson != null) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(aadharCard);
		dbPerson.setAadharcard(aadharCard);
		entityTransaction.commit();
	}else {
		System.out.println("Sorry id is not present");
	}
	}
	
	//find
	
	public void  findAadharCard(int id) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager  entityManager=entityManagerFactory.createEntityManager() ;

		Aadharcard dbAadharCard=entityManager.find(Aadharcard.class, id);
		if(dbAadharCard != null) 
		{
			System.out.println(dbAadharCard);
		}
		else {
			System.out.println("Sorry id is not present");
		}

	}
	
	
	//delete
	
	public void deleteAadharCard(int id) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	
	Aadharcard dbAadharCard=entityManager.find(Aadharcard.class,id);
	
	if(dbAadharCard !=null) {
		//id is present and that 
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(dbAadharCard);
		entityTransaction.commit();
		
	}
	else {
		//
		System.out.println("Sorry it is not Present");
	}
}

	
	//update
	public void updateAadharCard(int id,Aadharcard aadharcard) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Aadharcard dbAadharcard =entityManager.find(Aadharcard.class,id);
		
		if(dbAadharcard !=null) {
//			id is present then i can update the data
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			aadharcard.setId(2);
			entityManager.merge(aadharcard);
			entityTransaction.commit();
			
		}else {
			System.out.print("Sorry id is not present");
		}
	}
	
}
