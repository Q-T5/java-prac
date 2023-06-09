package JavaLambdas;

import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterfaceB {
	//abstract method
	String reverse(String n);
}

public class LambdaWithParam {
	//declare a refrerence to MyInterfaceB
	//assign a Lambda expression to the interface
	static MyInterfaceB ref = (str) -> {
		String result = "";
		for(int i = str.length()-1; i>=0; i--) {
			result += str.charAt(i);
		}

		return result;
	};
	public static void main(String[] args) {
		

		//call the method of the interface
		System.out.println("Lambda reversed: " + ref.reverse("lambda"));
	}
}
