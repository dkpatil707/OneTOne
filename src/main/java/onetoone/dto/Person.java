package onetoone.dto;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
//	--------------------------------owing side
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + ", aadharcard=" + aadharcard + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Aadharcard getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(Aadharcard aadharcard) {
		this.aadharcard = aadharcard;
	}

	@Id
	private int id;
	private String name;
	private String address;
	
//@OneToOne(fetch = FetchType.LAZY)
//	@OneToOne

	@OneToOne(cascade = CascadeType.REMOVE)
	
	private Aadharcard aadharcard;

	

}
