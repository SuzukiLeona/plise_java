package plise_java;

public class Ex1_1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < 100; i++) {
			sb.append(i + 1);
			sb.append(",");
		}

		String result = sb.toString();
		String List[] = result.split(",");

		System.out.println(result);
		for (String list : List) {
			System.out.print(list + " ");
		}
	}
}
