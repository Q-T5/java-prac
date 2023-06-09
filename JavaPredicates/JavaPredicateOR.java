//program to illustrate OR predicate
import java.util.function.Predicate;

class PredicateExample {
	public static Predicate<String> hasLengthOfTen = new Predicate<>() {
		@Override
		public boolean test(String t) {
			return t.length() > 10;
		}
	};
	
	public static void predicateOR() {
		Predicate<String> containsLetterA = (p) -> (p.contains("A"));
		String testString = "CAt";
		Boolean outcome = hasLengthOfTen.or(containsLetterA).test(testString);
		System.out.println(outcome);
	}
	
	public static void main(String[] args) {
		predicateOR();
	}
}

