package ua.lviv.lgs.pet;

public class Main {
	public static void main(String[] args) {

		Pet cow = (String s) -> System.out.println(s);
		cow.voice("ί κξπξβΰ- Μσσσ-Μσσσ");
		
		Pet dog = (String s) -> System.out.println(s);
		cow.voice("ί οερ- Γΰσσσ-Γΰσσσ");
		
		Pet cat = (String s) -> System.out.println(s);
		cow.voice("ί κ³ς- Μÿσσσ-Μÿσσσ");
			
	}
}

interface Pet{
	void voice(String s);
}
