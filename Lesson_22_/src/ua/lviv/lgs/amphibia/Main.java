package ua.lviv.lgs.amphibia;

import javax.print.attribute.standard.Media;

public class Main {
	public static void main(String[] args) {

		Sleep sleep = message -> System.out.println(message);
		sleep.sleep("I sleep");

		Eat eat = message -> System.out.println(message);
		eat.eat("I eat");

		Swim swim = message -> System.out.println(message);
		swim.swim("I swim");

		Walk walk = message -> System.out.println(message);
		walk.walk("I walk");
		
	}
}

interface Sleep {
	void sleep(String msg);
}

interface Eat {
	void eat(String msg);
}

interface Swim {
	void swim(String msg);
}

interface Walk {
	void walk(String msg);
}
