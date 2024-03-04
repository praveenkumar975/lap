//parameter Constructor code
class ConstructorEx2{
int a,b;
ConstructorEx2(int a, int b){  //parameter Constructor
this.a=a;
this.b=b;
}
//display method
void sum(){
System.out.println("value of a:"+a);
System.out.println("value of b:"+b);
System.out.println(a+b);
}
public static void main(String args[]){
ConstructorEx2 s=new ConstructorEx2(10,20);// object installation with parameter
s.sum();
}
}