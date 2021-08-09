package com.SkillDistillery.jets.entities;

public class FighterPlane extends Jet implements CombatReady {

	public FighterPlane() {
		super();
		
	}

	public FighterPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}
	
	@Override
	public void flight() {
		System.out.println(getModel() + " Flying");
	}

	
	
	
	
	


}
