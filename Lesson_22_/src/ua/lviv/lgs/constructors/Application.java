package ua.lviv.lgs.constructors;

public class Application {

	public static void main(String[] args) {

		MyConstructor1 myC1 = Constractors::new;
		Constractors c1 = myC1.c(4, 6);

		MyConstructor2 myC2 = Constractors::new;
		Constractors c2 = myC2.c(34, 5, "Some string");

		System.out.println(c1);
		System.out.println(c2);

	}

}

interface MyConstructor1 {
	Constractors c(int a, int b);
}

interface MyConstructor2 {
	Constractors c(int a, int b, String s);
}
