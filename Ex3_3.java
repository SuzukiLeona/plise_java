package plise_java;

import java.util.HashMap;
import java.util.Map;

public class Ex3_3 {
	public static void main(String[] args) {
		Hero hero1 = new Hero("斎藤");
		Hero hero2 = new Hero("鈴木");
		Map<Hero, Integer> heroes = new HashMap<>();
		heroes.put(hero1, 3);
		heroes.put(hero2, 7);
		for (Hero hero : heroes.keySet()) {
			System.out.println(hero.getName() + "が倒した敵＝" + heroes.get(hero));
		}
	}
}
