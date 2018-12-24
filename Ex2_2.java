package plise_java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex2_2 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate date = now.plusDays(100);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(date.format(dtf));
	}
}
