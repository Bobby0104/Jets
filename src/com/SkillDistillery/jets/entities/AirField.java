package com.SkillDistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	
	Scanner kb = new Scanner(System.in);
	
	List<Jet> fleet = new ArrayList<Jet>();
	
	public List<Jet> readJetsFromFile() {
		try (BufferedReader rd = new BufferedReader(new FileReader("Jets.txt"))) {
			String line;
			while ((line = rd.readLine()) != null) {
				String[] jetRecord = line.split(", ");
				Jet plane = null;
				switch (jetRecord[0]) {
				case "Fighter":
					plane = new FighterPlane(jetRecord[0], Double.parseDouble(jetRecord[1]),
							Integer.parseInt(jetRecord[2]), Long.parseLong(jetRecord[3]));
					fleet.add(plane);
				case "F-18":
					plane = new FighterPlane(jetRecord[0], Double.parseDouble(jetRecord[1]),
							Integer.parseInt(jetRecord[2]), Long.parseLong(jetRecord[3]));
					fleet.add(plane);
					break;
				case "Cargo":
					plane = new CargoPlane(jetRecord[0], Double.parseDouble(jetRecord[1]),
							Integer.parseInt(jetRecord[2]), Long.parseLong(jetRecord[3]));
					fleet.add(plane);
					break;
				case "Personnel Cargo":
					plane = new CargoPlane(jetRecord[0], Double.parseDouble(jetRecord[1]),
							Integer.parseInt(jetRecord[2]), Long.parseLong(jetRecord[3]));
					fleet.add(plane);
					break;
				case "JetImpl":
					plane = new JetImpl(jetRecord[0], Double.parseDouble(jetRecord[1]), Integer.parseInt(jetRecord[2]),
							Long.parseLong(jetRecord[3]));
					fleet.add(plane);
					break;
				default:
					System.out.println("something went wrong");

				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fleet;
	}

	

	

	public void listAllJets() {
		for (Jet fleets : fleet) {
			System.out.println(fleets);
		}	
	}	
	
	public void dogfight() {
		for(Jet jet: fleet) {
			if(jet instanceof CombatReady) {
				System.out.println("Fighting!");
			}
		}
	}
	public void loadCargo() {
		for(Jet jet: fleet) {
			if(jet instanceof CargoCarrier);
			System.out.println("Loading cargo.");
		}
	}
	
	public void fly() {
		for(Jet jet : fleet) {
			System.out.println("All jets flying");;
		}
	}
		
	
	public void removeJet() {
		int removeJet;
		for (int i = 0; i < fleet.size(); i++) {
			System.out.println(i+1 + "----" + fleet.get(i));
		}
		System.out.println("Which plane would you like removed?");
		fleet.remove(-1);		
	}
	
	public void fastestJet() {
		double speed = 0;
		Jet fastestJet = fleet.get(0);
		for(Jet jet : fleet) {
			if(jet.getSpeed() > speed) {
				fastestJet = jet;
			}
			System.out.println(jet);
		}
	}
	
public void addJet() {
		
		String type;
		String model;
		double speed;
		int range;
		long price;
				
	    System.out.println("What type of jet would you like to add?" + "Cargo, fighter, or passenger?");
	    type = kb.nextLine();
				
	    System.out.println("What is the model of your plane?");
		model = kb.nextLine();
				
	    System.out.println("Top speed of your plane?");
				speed = kb.nextDouble();
				
		System.out.println("Range of your plane?");
		range = kb.nextInt();
				
		System.out.println("Whats the price of your plane?");
		price = kb.nextLong();
				
		Jet newJet = null;
				
		if (type.equalsIgnoreCase("Cargo")) {
			newJet = new CargoPlane(model, speed, range, price);
		}else if(type.equalsIgnoreCase("Fighter")) {
			newJet = new FighterPlane(model, speed, range, price);
		}else if (type.equalsIgnoreCase("Passenger")) {
			newJet = new FighterPlane(model, speed, range, price);
		}
		
		System.out.println();
		System.out.println("You have now added " + newJet.getModel() + " to the fleet");
		fleet.add(newJet);
		}

//public String longestRange() {
//	
//
//	int longestRange = 0;
//	for (Jet jet : fleet) {
//		if (jet.getRange() > longestRange) {
//			longestRange = jet.getRange();
//			longestRange = jet.toString();	
//		}
//		return longestRange;
//		
//	}
//}
public void longestRange() {
	int range = 0;
	Jet longestRange = fleet.get(0);
	for(Jet jet : fleet) {
		if(jet.getRange() > range) {
			longestRange = jet;
		}
		System.out.println(jet);
	}
}







		
	

		
		
	
}

	
	

