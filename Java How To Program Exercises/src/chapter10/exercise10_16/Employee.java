// Grzegorz Ko?czak, 20.07.2016
// Exercise number 10.16 page 482
// Exercise from Java:How to program 10th edition

package chapter10.exercise10_16;

public abstract class Employee implements Payable {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;

	// constructor
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	// return first name
	public String getFirstName() {
		return firstName;
	}

	// return last name
	public String getLastName() {
		return lastName;
	}

	// return social security number
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	// return String representation of Employee object
	@Override
	public String toString() {
		return String.format("%s %s%nsocial security number: %s", getFirstName(), getLastName(),
				getSocialSecurityNumber());
	}

	// abstract method must be overridden by concrete subclasses
	public abstract double earnings(); // no implementation here
	
	@Override
	public double getPaymentAmount() {
		return earnings();
	}
} // end abstract class Employee
