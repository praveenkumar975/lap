//type1
/*class InstanceVar{
int x=100; //inside the class but outside the method is called instance variable.
 public static void main(String args[]){
	InstanceVar a=new InstanceVar(); //Creating an instance of the x
	System.out.println(a.x); //Accessing instance variable using the instance 'a'
 }
}*/
//type2
class InstanceVar{
int x=100; //inside the class outside but the method is called instance variable.
void main(){
	System.out.println(x);
}
 public static void main(String args[]){
	InstanceVar a=new InstanceVar(); //Creating an instance of the x
	a.main();		
 }
}