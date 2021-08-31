package main;

import kitchen.BigCup;
import kitchen.Cup;
import kitchen.SmallCup;

public class Application {

	public static void main(String[] args) {
		Cup cupA = new Cup("Milk", 300);
		Cup cupB = new Cup("Water", 500);
		Cup cupC = new SmallCup("Tea", 200);
		Cup cupD = new BigCup("Water", 200);

		cupA = new Cup(cupA.getLiquidName(), (cupA.getLiquidVolume() - 50));
		cupB = new Cup(cupB.getLiquidName(), (cupB.getLiquidVolume() + 50));
		cupD = new BigCup(cupD.getLiquidName(), (cupD.getLiquidVolume() + cupB.getLiquidVolume()));

		System.out.println("There is " + cupA.getLiquidVolume() + "mL of " + cupA.getLiquidName() + " in the cup A.");
		System.out.println("There is " + cupB.getLiquidVolume() + "mL of " + cupB.getLiquidName() + " in the cup B.");
		System.out.println("There is " + cupC.getLiquidVolume() + "mL of " + cupC.getLiquidName() + " in the cup C.");
		System.out.println("There is " + cupD.getLiquidVolume() + "mL of " + cupD.getLiquidName() + " in the cup D.");

	}

}
