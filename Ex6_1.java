package plise_java;

interface Func1 {
	boolean call(int x);
}

interface Func2 {
	String call(boolean male, String name);
}

public class Ex6_1 {
	public static void main(String[] args) {
		Func1 func1 = FuncList::isOdd;
		FuncList funcList = new FuncList();
		Func2 func2 = funcList::addNamePrefix;
		System.out.println(func1.call(0));
		System.out.println(func2.call(true, "Suzuki"));
	}
}
