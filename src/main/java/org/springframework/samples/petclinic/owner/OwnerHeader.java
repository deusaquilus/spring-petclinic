package org.springframework.samples.petclinic.owner;

/**
 * Scalar projection of the owner header for the owner details page. Exposes the
 * same property names as {@link Owner} so the existing template section
 * (th:object="${owner}", firstName/lastName/address/city/telephone/id) renders
 * unchanged without initializing the EAGER pets/visits graph.
 */
public class OwnerHeader {

	private final Integer id;

	private final String firstName;

	private final String lastName;

	private final String address;

	private final String city;

	private final String telephone;

	public OwnerHeader(Integer id, String firstName, String lastName, String address, String city,
			String telephone) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
	}

	public Integer getId() {
		return this.id;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getAddress() {
		return this.address;
	}

	public String getCity() {
		return this.city;
	}

	public String getTelephone() {
		return this.telephone;
	}

}
