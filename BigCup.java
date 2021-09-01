package kitchen;

public class BigCup extends Cup {
	
	public BigCup(String liquidName, int liquidVolume) {
		super(liquidName, liquidVolume);
	}

	void setLiquidVolume(short liquidVolume) {
		if (liquidVolume >= 0 && liquidVolume <= 1000) {
			super.setLiquidVolume(liquidVolume);
		} else if (liquidVolume > 1000) {
			System.err.println("ERROR! You can pour only 1000 mL of liquid into this cup!");
		} else {
			System.err.println("ERROR! You can not pour less than 0 mL into each cup!");
		}
	}
}
