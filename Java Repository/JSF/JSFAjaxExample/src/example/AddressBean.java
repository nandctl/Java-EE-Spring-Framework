package example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class AddressBean {

	private List<String> countries;
	private Map<String, List<String>> statesByCountry;

	private String country;
	private String state;

	public List<String> getCountries() {
		return countries;
	}

	public void setCountries(List<String> countries) {
		this.countries = countries;
	}

	public Map<String, List<String>> getStatesByCountry() {
		return statesByCountry;
	}

	public void setStatesByCountry(Map<String, List<String>> statesByCountry) {
		this.statesByCountry = statesByCountry;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@PostConstruct
	public void init() {
		countries = Arrays.asList("Turkey", "US");
		statesByCountry = new HashMap<String, List<String>>();
		statesByCountry.put("Turkey", Arrays.asList("IST", "Ank"));
		statesByCountry.put("US", Arrays.asList("NY", "NJ"));
	}

	public List<String> getStates(String country) {

		System.out.println("getStates!");
		List<String> states = statesByCountry.get(country);

		return states;
	}



}
