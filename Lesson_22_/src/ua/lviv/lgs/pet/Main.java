package ua.lviv.lgs.pet;

public class Main {
	public static void main(String[] args) {

		Pet cow = (String s) -> System.out.println(s);
		cow.voice("� ������- ����-����");
		
		Pet dog = (String s) -> System.out.println(s);
		cow.voice("� ���- �����-�����");
		
		Pet cat = (String s) -> System.out.println(s);
		cow.voice("� ��- �����-�����");
			
	}
}

interface Pet{
	void voice(String s);
}
