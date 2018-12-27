package plise_java;

import java.util.ArrayList;
import java.util.List;

public class Ex3_2 {
	public static void main(String[] args) {
		Hero hero1 = new Hero("斎藤");
		Hero hero2 = new Hero("鈴木");
		List<Hero> heroes = new ArrayList<>();
		heroes.add(hero1);
		heroes.add(hero2);
		for (Hero hero : heroes) {
			System.out.println(hero.getName());
		}
	}
}
