package _16.oneToOne.bi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee16 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;
    private int salary;

    // @OneToOne(mappedBy="employee")
    // iki taraf icin de mappedBy kullanmak calisma zamaninda probleme neden
    // olacaktir, legal degildir.

    @OneToOne
    @JoinColumn(name = "park_id", unique=true)
    private ParkingSpace2 parkingSpace2;

    Employee16() {
	super();
    }

    public Employee16(String name, String surname, int salary) {
	super();
	this.name = name;
	this.surname = surname;
	this.salary = salary;
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

    public String getSurname() {
	return surname;
    }

    public void setSurname(String surname) {
	this.surname = surname;
    }

    public int getSalary() {
	return salary;
    }

    public void setSalary(int salary) {
	this.salary = salary;
    }

    public ParkingSpace2 getParkingSpace() {
	return parkingSpace2;
    }

    public void setParkingSpace(ParkingSpace2 parkingSpace2) {
	this.parkingSpace2 = parkingSpace2;
    }

    @Override
    public String toString() {
	return "Employee16 [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + ", parkingSpace2=" + parkingSpace2 + "]";
    }

}