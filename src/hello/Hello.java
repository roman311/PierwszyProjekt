package hello;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Yo world!");
		
		Osoba druga = WczytajOsobe.nowaOsoba();
		System.out.println("Druga osoba to:" + druga);
	}

}
