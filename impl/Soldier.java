package zombiewar.impl;
import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Soldier extends Character implements ISurvivor {
	private static int objCount = 0;
	private int id=0;
	
	/**
	 * A soldier starts with 100 points of health
	 */
	public Soldier() {
		super(100);
		id = objCount++;
	}

	@Override
	public void attack(IZombie zombie) {
		zombie.decreaseHealth(10);
	}
	
	public String toString(){
		return "Soldier " + id;
	}
}
