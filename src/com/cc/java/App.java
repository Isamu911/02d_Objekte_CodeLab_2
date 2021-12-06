package com.cc.java;

public class App {

	public static void main(String[] args) {
		// **Name/Vorname/Funktion/Eintrittsjahr**
		
		Mitarbeiter worker1 = new Mitarbeiter("Duck", "Donald", "Schleifer", 2001);
	
	
        output("Nachname: " + worker1.getLastName());
        output("Vorname: " + worker1.getFirstName());
        output("Funktion: " + worker1.getFunction());
        output("Eintrittsjahr: " + worker1.getBeginningYear());

		output("----------------");

		Mitarbeiter worker2 = new Mitarbeiter("Duck", "Dagobert", "Chef", 1989);
	
	
        output("Nachname: " + worker2.getLastName());
        output("Vorname: " + worker2.getFirstName());
        output("Funktion: " + worker2.getFunction());
        output("Eintrittsjahr: " + worker2.getBeginningYear());

		output("------------------");


		Mitarbeiter worker3 = new Mitarbeiter("Düsentrieb", "Daniel", "Entwickler", 1990);
	
	
        output("Nachname: " + worker3.getLastName());
        output("Vorname: " + worker3.getFirstName());
        output("Funktion: " + worker3.getFunction());
        output("Eintrittsjahr: " + worker3.getBeginningYear());


		output("------------------");

		Mitarbeiter worker4 = new Mitarbeiter("Duck", "Daisy", "Ärztin", 2001);
	
	
        output("Nachname: " + worker4.getLastName());
        output("Vorname: " + worker4.getFirstName());
        output("Funktion: " + worker4.getFunction());
        output("Eintrittsjahr: " + worker4.getBeginningYear());

		


	}

	private static void output(String outStr) {
		System.out.println(outStr);
	}

};
