import java.util.ArrayList;
import java.util.Random;
import java.awt.Point;

public class Test{
	private ArrayList<Castle> castles;
	private ArrayList<String> names;
	private Random seed;

	public Test(){
		castles = new ArrayList<Castle>();
		names = new ArrayList<String>();
		nameGenerator();
		seed = new Random();
		for(int i = 0; i < names.size(); i++){
			if(i % 3 == 1){
				castles.add(new Castle(names.get(i), seed.nextInt(10) - 2, new Point(seed.nextInt(20), seed.nextInt(20)), seed.nextInt(20) - 5));
			}else if(i % 3 == 0){
				castles.add(new European(names.get(i), seed.nextInt(10) - 2, new Point(seed.nextInt(20), seed.nextInt(20)), seed.nextInt(20) - 5, seed.nextInt(10)));
			}else{
				castles.add(new Japanese(names.get(i), seed.nextInt(10) - 2, new Point(seed.nextInt(20), seed.nextInt(20)), seed.nextInt(20) - 5, seed.nextInt(10)));
			}
		}
	}

	public void testCastle(){
		for(Castle castle : castles){
			castle.attack(seed.nextDouble()*3);
		}
		for(Castle castle : castles){
			castle.showSituation();
		}
	}

	public void testEuropean(){
		for(Castle castle : castles){
			if(castle instanceof European)
				castle.attack(seed.nextDouble()*3);
		}
		for(Castle castle : castles){
			if(castle instanceof European)
				castle.showSituation();
		}
	}

	public void testJapanese(){
		for(Castle castle : castles){
			if(castle instanceof Japanese)
				castle.attack(seed.nextDouble()*3);
		}
		for(Castle castle : castles){
			if(castle instanceof Japanese)
				castle.showSituation();
		}
	}

	public void nameGenerator(){
		names.add("Neuschwanstein");
		names.add("Alnwick");
		names.add("Dover");
		names.add("Matsumoto");
		names.add("Moncalieri");
		names.add("Edinburgh");
		names.add("Pena");
		names.add("Glamis");
		names.add("Conwy");
		names.add("Leeds");
		names.add("Himeji");
		names.add("Sforza");
		names.add("Balmoral");
	}
}
