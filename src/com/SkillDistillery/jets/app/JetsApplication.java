package com.SkillDistillery.jets.app;

import java.util.Scanner;


import com.SkillDistillery.jets.entities.AirField;

public class JetsApplication {

	AirField airField = new AirField();
	Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		JetsApplication jetsApp = new JetsApplication();
		jetsApp.airField.readJetsFromFile();
		jetsApp.start();
	}
	
	
	public void Menu() {
		System.out.println("********************************");
		System.out.println("1: List Fleet.");
		System.out.println("2: Fly All Jets.");
		System.out.println("3: View fastest jet.");
		System.out.println("4: View jet with longest range.");
		System.out.println("5: Load all cargo jets");
		System.out.println("6: Dogfight.");
		System.out.println("7: Add a jet to fleet.");
		System.out.println("8: Remove jet from fleet.");
		System.out.println("9: Quit.");
		System.out.println("********************************");
	}
	
	public void start() {
		
		Menu();
		boolean keepGoing = true;
		while (keepGoing) {
		String select = kb.next();
		if(select.equals("1")) {
			airField.listAllJets();
		} else if (select.equals("2")) {
			airField.fly();
		} else if (select.equals("3")) {			
			System.out.println(airField.viewFastestJet());
		} else if (select.equals("4")) {			
		System.out.println(airField.viewLongestRange());
		} else if (select.equals("5")) {
			airField.loadCargo();
		} else if (select.equals("6")) {
			airField.dogfight();
		} else if (select.equals("7")) {
			airField.addJet();
		} else if (select.equals("8")) {
			airField.removeJet();
		} else if (select.equals("9")) {
			keepGoing = false;
			break;
		} else {
			System.out.println("Invalid response. Please Try again.");
		}
		System.out.println();
		continue;
	}
}
		
}
		
			
				
			

		

	
	
		
			
		
	


	

