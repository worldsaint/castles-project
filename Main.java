import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Test test = new Test();
		Scanner in = new Scanner(System.in);
		System.out.println("Testing Castelo class...");
		test.testCastle();
		System.out.println("Press ENTER to continue...");
		in.nextLine();
		System.out.println("Testing Europeu class...");
		test.testEuropean();
		System.out.println("Press ENTER to continue...");
		in.nextLine();
		System.out.println("Testing Japones class...");
		test.testJapanese();
		System.out.println("Press ENTER to continue...");
		in.nextLine();
	}
}
