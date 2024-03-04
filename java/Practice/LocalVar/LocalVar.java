//type1
/*class LocalVar{
public static void main(String args[]){
int x=10;//inside the method is called local variable
System.out.println(x);
}
}*/
class LocalVar{
public static void main(String args[]){
	int localValue=1000;
	System.out.println(localValue);
local();
 }
static void local(){
	int anotherValue=10001;
	System.out.println(anotherValue);
 }
}