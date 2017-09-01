import java.util.Random;
import java.awt.Point;

public class Japanese extends Castle{
	protected int numSamurais;

	public Japanese(String name, double defenses, Point location, double hitPoints, int numSamurais){
		super(name, defenses, location, hitPoints);
		this.numSamurais = numSamurais;
	}

	public void attack(double dano){
		Random rand = new Random();
		if(numSamurais > 0){
			numSamurais -= 2 + rand.nextInt(3);
		}else{
			super.attack(dano);
		}
	}

	public String toString(){
		String retorno = super.toString() + "\nNúmero de samurais: " + numSamurais;
		return retorno;
	}
}
