import java.util.Random;
import java.awt.Point;

public class European extends Castle{
	protected int numPaladins;

	public European(String name, double defenses, Point location, double hitPoints, int numPaladins){
		super(name, defenses, location, hitPoints);
		this.numPaladins = numPaladins;
	}

	public void attack(double dano){
		Random rand = new Random();
		if(numPaladins > 0){
			numPaladins -= 2 + rand.nextInt(3);
		}else{
			super.attack(dano);
		}
	}

	public String toString(){
		String retorno = super.toString() + "\nPaladins: " + numPaladins;
		return retorno;
	}
}
