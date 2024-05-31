package hw5JavaMethods;

public class MyFamily {

	int child1Age = 13;
	int child2Age = 10;
	int child3Age = 8;
	int child4Age = 5;

	// Step 3: Implement a return type method
	public int myFamily() {
		int sum = child1Age + child2Age + child3Age + child4Age;

		System.out.println("The sum of my childern age is : " + sum);
		return sum;
	}

	// Step 4: Create a main method
	public static void main(String[] args) {
		MyFamily family = new MyFamily();
		family.myFamily();
	}

}
