package Lab5.intf;

public interface ICharacter {

	/**
	 * decrease in health as a result of being attacked.
	 * 
	 * @param increment the amount of health to decrease.
	 */
	void decreaseHealth(int increment);
	
	/**
	 * Is the character still alive?
	 * @return true if still alive.
	 */
	public boolean isAlive();
}

