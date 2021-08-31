package kitchen;

public class Cup {

	private String liquidName;
    short liquidVolume;


	public Cup(String liquidName, int liquidVolume) {
		setLiquidName(liquidName);
		setLiquidVolume((short)liquidVolume);
	}

	// get/set methods for liquid name
	public String getLiquidName() {
		return liquidName;
	}

	void setLiquidName(String liquidName) {
		if (liquidName.equals("Water") || liquidName.equals("Milk") || liquidName.equals("Tea")) {
			this.liquidName = liquidName;
		} else {
			System.err.println("ERROR! You can pour only Water, Milk or Tea into this cup!");
		}
	}

	// get/set methods for liquid volume
	public short getLiquidVolume() {
		return liquidVolume;
	}

	void setLiquidVolume(short liquidVolume) {
		if (liquidVolume >= 0 && liquidVolume <=600) {
			this.liquidVolume =(short) liquidVolume;
		} else  if(liquidVolume>600){
			System.err.println("ERROR! You can pour only 600 mL of liquid into this cup!");
		} else {
			System.err.println("ERROR! You can not pour less than 0 mL into each cup!");
		}
	}

}



