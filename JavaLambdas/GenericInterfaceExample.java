package JavaLambdas;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface GenericInterface<T> {
	//generic method
	T func(T t);
}

public class GenericInterfaceExample {
	public static void main(String[] args) {
		//declare a reference to GenericInterface
		//the GenericInterface in this example operates on String data
		//assign a Lambda expression to it
		GenericInterface<String> reverse = (str) -> {
			String result = "";
			for(int i = str.length() - 1; i >= 0; i-- ) {
				result += str.charAt(i);
			}
			
			return result;
		};

		System.out.println("Lambda reversed: " + reverse.func("lambda"));

		GenericInterface<Integer> factorial = (n) -> {
			Integer result = 1;
			for(Integer i = 1; i <= n; i++) {
				result = i * result;
			}
			
			return result;
		};

		System.out.println("Factorial of 5: " + factorial.func(5));
	}
}
