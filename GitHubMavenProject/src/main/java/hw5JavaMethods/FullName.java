package hw5JavaMethods;

public class FullName {

	// Implement a return type parameterized method
	public String fullName(String fName, String lName) {

		String fullName = fName + " " + lName;

		System.out.println("Family Member :" + fullName);

		return fullName;
	}

	// Create a main method
	public static void main(String[] args) {

		FullName fmember1 = new FullName();
		FullName fmember2 = new FullName();
		FullName fmember3 = new FullName();
		FullName fmember4 = new FullName();

		fmember1.fullName("John", "Kerry");
		fmember2.fullName("John", "Cina");
		fmember3.fullName("Keran", "Smith");
		fmember4.fullName("Jimmy", "Joe");

	}

}
