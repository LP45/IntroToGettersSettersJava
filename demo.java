package gettersAndSetters;

public class Demo {	
		// The private keyword is an access modifier used for attributes, methods and constructors, 
		// making them only accessible within the declared class.
		private String name;
		private  int year;
		private  int cost;
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
		
		void show() {
			System.out.println("Your name is " +this.name);
			System.out.println("Your computer came out in "+this.year);
			System.out.println("Your computer cost " +this.cost);
		}
		
	}

