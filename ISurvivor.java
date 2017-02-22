package zombiewar.intf;

public interface ISurvivor extends ICharacter {
	/**
	 * Attack a zombie by decreasing its health.
	 * 
	 * @param zombie 
	 */
	public void attack(IZombie zombie);
}
