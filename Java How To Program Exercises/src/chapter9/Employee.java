// Grzegorz Ko�czak, 19.07.2016
// Exercise number 9.14 page 436
// Exercise from Java:How to program 10th edition

package chapter9;

public class Employee {

	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n", "employee", getFirstName(),
				getLastName(), "social security number", getSocialSecurityNumber());
	}
}
