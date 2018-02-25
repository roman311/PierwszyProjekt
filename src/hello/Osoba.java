package hello;

import java.time.LocalTime;

public class Osoba {
	public Osoba(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public LocalTime getDataUrodzenia() {
		return dataUrodzenia;
	}

	public void setDataUrodzenia(LocalTime dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}

	private String imie, nazwisko;
	private LocalTime dataUrodzenia;

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	
	public Osoba() {
		System.out.println("Konstruktor domyslny");
	}

	public Osoba(String imie, String nazwisko, LocalTime dataUrodzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.dataUrodzenia = dataUrodzenia;
	}


	}


