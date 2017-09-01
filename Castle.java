import java.awt.Point;

public class Castle{
	protected double defenses;
	protected Point location;
	protected double hitPoints;
	protected String name;

	public Castle(String name, double defenses, Point location, double hitPoints){
		this.name = name;
		this.defenses = defenses;
		this.location = location;
		this.hitPoints = hitPoints;
	}

	public void showSituation(){
		System.out.println(this);
		if(hitPoints <= 0.0) System.out.println("Falled castle");
	}

	public void attack(double dano){
		if(defenses > 0.0){
			defenses -= dano;
		}else{
			hitPoints -= dano;
		}
	}

	public Point getLocation(){
		return location;
	}

	public String getName(){
		return name;
	}

	public String toString(){
		String retorno = "Name: " + name + "\nDefenses: " + defenses + "\nLocation: x = " + location.getX() + ", y = " + location.getY() + "\nHP: " + hitPoints;
		return retorno;
	}
}
