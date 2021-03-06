import java.awt.Point;

public class Character{
	protected double hitPoints;
	protected double strength;
	protected double defense;
	protected double criticalRate;
	protected Point location;

	public Character(double hitPoints, double strength, double defense, double criticalRate, Point location){
		if(hitPoints >= 0) this.hitPoints = hitPoints;
		else this.hitPoints = 0;
		this.strength = strength;
		this.defense = defense;
		if(criticalRate >= 0) this.criticalRate = criticalRate;
		else this.criticalRate = 0;
		this.location = location;
	}

	public void damageReceive(double damage){
		if(damage <= hitPoints) hitPoints -= damage;
		else hitPoints = 0;
	}
}
