package zombiegame.intf;

public interface IZombie extends ICharacter {
	/**
	 * Attack a survivor
	 * 
	 * @param survivor 
	 */
	public void attack(ISurvivor survivor);
}
