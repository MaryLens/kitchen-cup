package kitchen;

public class SmallCup extends Cup {

	public SmallCup(String liquidName, int liquidVolume) {
		super(liquidName, liquidVolume);
	}

	void setLiquidVolume(short liquidVolume) {
		if (liquidVolume >= 0 && liquidVolume <= 250) {
			super.setLiquidVolume(liquidVolume);
		} else if (liquidVolume > 250) {
			System.err.println("ERROR! You can pour only 250 mL of liquid into this cup!");
		} else {
			System.err.println("ERROR! You can not pour less than 0 mL into each cup!");
		}
	}

}
