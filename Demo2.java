package gettersAndSetters;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Demo c1 = new Demo();
		System.out.println("What is your name?");
		String myName = scan.next();
		c1.setName(myName);
		System.out.println("What year is you laptop?");
		int Lyear = scan.nextInt();
		c1.setYear(Lyear);
		scan.nextLine();
		System.out.println("How much Did you pay?" );
		int Lprice = scan.nextInt();
		c1.setCost(Lprice);
		c1.show();
		
		
		
	}

}
