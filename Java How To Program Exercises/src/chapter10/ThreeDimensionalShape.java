// Grzegorz Ko�czak, 20.07.2016
// Exercise number 10.13 page 481
// Exercise from Java:How to program 10th edition

package chapter10;

public abstract class ThreeDimensionalShape extends Shape {

	public ThreeDimensionalShape(double side) {
		super(side);
	}

	public abstract double getVolume();
}
