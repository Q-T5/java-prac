package JavaLambdas;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface {
	//abstract method
	double getPiValue();
}

public class LambdaExample {
	public static void main(String[] args) {
		//declare a reference to MyInterface
		MyInterface ref;

		//lambda expression- defines the implementation of the only method of a
		//FunctionalInterface
		ref = () -> 3.1452;

		System.out.println("Value of PI: " + ref.getPiValue());
	}
}
