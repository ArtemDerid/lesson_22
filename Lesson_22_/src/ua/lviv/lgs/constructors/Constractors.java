package ua.lviv.lgs.constructors;

public class Constractors {
	
	private int alfa;
	private int beta;
	private String string;
	
	Constractors(int alfa, int beta) {
		this.alfa = alfa;
		this.beta = beta;
	}
	
	Constractors(int alfa, int beta, String string) {
		this(alfa, beta);
		this.string = string;
	}

	@Override
	public String toString() {
		return "Constractors [alfa=" + alfa + ", beta=" + beta + ", string=" + string + "]";
	}

	
	
	
	
}
