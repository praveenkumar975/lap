/*Local Variable
class arithmetic{
public static void main(String args[]){
int a=10,b=20;
int sum = a+b;
	System.out.println("total="+sum);
}
}*/
/*static Variable
class arithmetic{
static int a=10,b=20;
public static void main(String args[]){
	int sum = a+b;
	int sub = a-b;
	int div = a/b;
	int mul = a*b;
	System.out.println("total="+sum);
	System.out.println("total="+sub);
	System.out.println("total="+div);
	System.out.println("total="+mul);
}
}*/
/*instance variable
class Arithmetic{
int a=10,b=20;
int sum = a+b;
int sub = a-b;
int div = a/b;
int mul = a*b;
public static void main(String args[]){
Arithmetic s=new Arithmetic();
System.out.println("total="+s.sum);
System.out.println("total="+s.sub);
System.out.println("total="+s.div);
System.out.println("total="+s.mul);
}
}*/
//Constructor
/*class Arithmetic{
	int a=10,b=20;
	int sum = a+b;
Arithmetic(){
	System.out.println("total="+sum);
}
public static void main(String args[]){
	Arithmetic s=new Arithmetic();
}
}*/
//defualt constructor
/*class Arithmetic{
	int a,b;
	int sum = a+b;
Arithmetic(){
	System.out.println("total="+sum);
}
public static void main(String args[]){
	Arithmetic s=new Arithmetic();
}
}*/
//parameter constructor
class Arithmetic{
	int a,b;
	int sum = a+b;
Arithmetic(int a1,int b){
	a=a;
	b=b;
	sum=a+b;
}
void display(){
	System.out.println("total="+sum);
}
public static void main(String args[]){
	Arithmetic s=new Arithmetic(20,30);
	s.display();
}
}
