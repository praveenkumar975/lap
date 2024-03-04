package Com.java;

public class Singleton {
	private static Singleton instance;
 	private Singleton(){
 		
 	}
 	public static Singleton getinstance() {
 		if(instance == null) {
 			instance = new Singleton();
 		}
 		return instance;
 	}
 	public void show() {
 		System.out.println("this singleton");
 	}
	public static void main(String[] args) {
		Singleton si = Singleton.getinstance();
		si.show();
	}

}
