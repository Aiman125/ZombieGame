package Lab5.impl;
import Lab5.intf.ISurvivor;
import Lab5.intf.IZombie;

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
