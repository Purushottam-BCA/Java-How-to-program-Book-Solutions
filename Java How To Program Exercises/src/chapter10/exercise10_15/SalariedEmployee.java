// Grzegorz Ko�czak, 20.07.2016
// Exercise number 10.15 page 482
// Exercise from Java:How to program 10th edition

package chapter10.exercise10_15;

public class SalariedEmployee extends Employee {
	private double weeklySalary;

	// constructor
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber);

		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");

		this.weeklySalary = weeklySalary;
	}

	// set salary
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");

		this.weeklySalary = weeklySalary;
	}

	// return salary
	public double getWeeklySalary() {
		return weeklySalary;
	}

	// calculate earnings; implement interface Payable method that was
	// abstract in superclass Employee
	@Override
	public double getPaymentAmount() {
		return getWeeklySalary();
	}

	// return String representation of SalariedEmployee object
	@Override
	public String toString() {
		return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
	}
} // end class SalariedEmployee