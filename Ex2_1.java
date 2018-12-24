package plise_java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex2_1 {
	public static void main(String[] args) {
		Date now = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(now);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DAY_OF_MONTH, day + 100);
		Date dateInf = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(sdf.format(dateInf));
	}
}