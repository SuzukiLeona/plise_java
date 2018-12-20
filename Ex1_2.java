package plise_java;

public class Ex1_2 {
	public static void main(String[] args) {
		String testFolder1 = "¥¥javadev";
		String testFolder2 = "¥¥javadev¥¥";
		String testFile = "readme.txt";

		String result1 = concatenation(testFolder1, testFile);
		String result2 = concatenation(testFolder2, testFile);

		System.out.println(result1);
		System.out.println(result2);
	}

	public static String concatenation(String folder, String file) {
		StringBuilder sb = new StringBuilder();
		sb.append(folder);
		if (!folder.endsWith("¥¥")) {
			sb.append("¥¥");
		}
		sb.append(file);
		String result = sb.toString();

		return result;
	}
}
