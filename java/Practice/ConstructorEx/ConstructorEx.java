class ConstructorEx{
int a;  // Instance variable
String b;   // Instance variable
// Constructor with parameters
ConstructorEx(int a,String b){
	this.a=a;  // Assigning parameter 'a' to instance variable 'a'
	this.b=b;  // Assigning parameter 'b' to instance variable 'b'
System.out.println(a+b);
}
public static void main(String args[]){
// Creating an instance of the ConstructorEx class
ConstructorEx c=new ConstructorEx(10,"Vishnu");
}
}