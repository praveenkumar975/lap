class InsLocal {
	int intvar = 112; // instance variable

	// instance method
	void main() {
		// Local variables within the method
		int stuId = 101;
		String stuName = "ram";
		// Printing values using local and instance variables
		System.out.println("Student num: " + stuId);
		System.out.println("Student Name: " + stuName);
		System.out.println(intvar);
	}

	// Entry point of the program
	public static void main(String args[]) {
		// Creating an instance of the InsLocal class
		InsLocal s = new InsLocal();
		// Calling the instance method main()
		s.main();
	}
}