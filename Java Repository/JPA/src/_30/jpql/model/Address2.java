package _30.jpql.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Address2 {
	@Id
	@TableGenerator(name="Add_Gen")
	@GeneratedValue(generator="Add_Gen")
	private String id;
    private String street;
    private String city;
    private String state;
    private String zip;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public Address2(String street, String city, String state, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public Address2() {
		super();
	}
	
	
	
}
