package plise_java;

public class Ex6_2 {
	public static void main(String[] args) {
		Func1 func1 = x -> {
			return (x % 2 == 1);
		};
		Func2 func2 = (male, name) -> {
			if (male == true) {
				return "Mr." + name;
			} else {
				return "Ms." + name;
			}
		};
		System.out.println(func1.call(0));
		System.out.println(func2.call(true, "Suzuki"));
	}
}
