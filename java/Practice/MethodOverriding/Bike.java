class Vehicle {
	void strat() {
		System.out.println("vehicle started");

	}
}
	class Car extends Vehicle{
		void starter() {
			System.out.println("car started");
		}
	}
		class Bike extends Vehicle{
			void started() {
				System.out.println("bike started");
	}
	public static void main(String[] args) {
		Bike b = new Bike();
		b.started();


		Car c = new Car();
		c.starter();	
	
		Vehicle v = new Car();
		v.strat();
		


	}

}