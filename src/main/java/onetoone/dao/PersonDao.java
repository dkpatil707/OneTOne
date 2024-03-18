package onetoone.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoone.dto.Aadharcard;
import onetoone.dto.Person;


public class PersonDao {
	
	private EntityManager entityManager;

	public void savaPerson(Person person) {
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
	}
//	find
	
//	public void findPerson(int id) {
//		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//		EntityManager  entityManager=entityManagerFactory.createEntityManager() ;
//		Person dbPeraon=entityManager.find(Person.class,id);
//		
//				if(dbPeraon !=null) {
//					System.out.print(dbPeraon);
//				}
//				else {
//					System.out.println("soory id is not present");
//				}
//				
//	}
	
	//delete
	
	public void deletePerson(int id ) {
		
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManagerFactoryEntityManager=entityManagerFactory.createEntityManager();
	Person dbPeraon=entityManager.find(Person.class,id);
				
		if(dbPeraon !=null) {
			//id is present and that 
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbPeraon);
			entityTransaction.commit();
		}
		else {
			//
			System.out.println("Sorry it is not Present");
		}
				
				
	}
	//UPDATE
	public void updatePerson(int id ,Person person ) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Aadharcard dbAadharcard =entityManager.find(Aadharcard.class,id);
		
		if(dbAadharcard !=null) {
//			id is present then i can update the data
        	EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			person.setId(id);
			entityManager.merge(person);
			entityTransaction.commit();
			
		}else {
			System.out.print("Sorry id is not present");
		}
	}
	
		
		
	}


