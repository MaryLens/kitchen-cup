package main;

import kitchen.Cup;

public class Application {

	public static void main(String[] args) {
		Cup cupA = new Cup("Milk",300);
		Cup cupB = new Cup("Water",500);
		
		 cupA = new Cup(cupA.getLiquidName(),(cupA.getLiquidVolume()-50));
		 cupB = new Cup(cupB.getLiquidName(),(cupB.getLiquidVolume()+50));
		
		System.out.println("There is "+cupA.getLiquidVolume()+"mL of "+cupA.getLiquidName()+" in the cup A.");
		System.out.println("There is "+cupB.getLiquidVolume()+"mL of "+cupB.getLiquidName()+" in the cup B.");

	}

}
