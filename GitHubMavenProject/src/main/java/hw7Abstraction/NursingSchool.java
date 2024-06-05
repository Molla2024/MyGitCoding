package hw7Abstraction;

public abstract class NursingSchool {  //Step 04 Create the Nursing school

	//Abstract method
	public abstract void hygiene();
	
	//Non-abstract method
	public void caring(){
		System.out.println("Caring is an essential skill in nursing.");
	}	
		// Default Constructor
		public NursingSchool(){
		System.out.println("Nursing School Constructor");
	}
}
	


