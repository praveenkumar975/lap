/*Local Variable
class arithmetic{
public static void main(String args[]){
int a=10,b=20;
int sum = a+b;
	System.out.println("total="+sum);
}
}*/
//static Variable
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
}
//instance variable
class arithmetic{
int a=10,b=20;
int sum = a+b;
public static void main(String args[]){
arithmetic s=new arithmetic();
System.out.println("total="+s.sum);
}
}

