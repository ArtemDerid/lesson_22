package ua.lviv.lgs.coin;

public class Application {
	public static void main(String[] args) {

		int toss = (int) (Math.random() * 1000);
		int headsOrTails = 1;
		int heads = 0;
		int tails = 0;

		for (int i = 0; i < toss; i++) {

			HeadsOrTails hOt = () -> headsOrTails == (int) ((Math.random() * 2) + 1);
			if (hOt.check()) 
				heads++;
			if (!hOt.check()) 
				tails++;
		}

		System.out.println(
				"You throw a coin " + toss + " times. \nNumber of heads: " + heads + "\nNumber of tails: " + tails);
	}

}

interface HeadsOrTails {
	boolean check();
}
