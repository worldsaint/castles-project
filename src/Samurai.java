import java.awt.Point;

public class Samurai extends Character{
	private Weapon katana;

	public Samurai(double hitPoints, double strength, double defesa, double criticalRate, Point location){
		super(hitPoints, strength, defesa, criticalRate, location);
	}

	public void damageReceive(double damage){
		if(damage <= hitPoints) hitPoints -= damage;
		else hitPoints = 0;
	}
}
