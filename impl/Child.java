package zombiewar.impl;
import zombiewar.intf.ISurvivor;
import zombiewar.intf.IZombie;

public class Child extends Character implements ISurvivor{
private static int objCount = 0;
	private int id=0;
	
	public Child() {
		super(20);
		id = objCount++;
	}

	@Override
	public void attack(IZombie zombie) {
		zombie.decreaseHealth(2);
	}
	
	public String toString(){
		return "Child " + id;
	}
}
