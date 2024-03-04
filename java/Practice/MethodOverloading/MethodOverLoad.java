class MethodOverLoad{
void sum(int a,int b){
System.out.println(a+b);
}
void sum(float a,float b){
System.out.println(a+b);
}
void sum(char a,char b){
System.out.println(a+b);
}
void sum(double a, int b){
System.out.println(a+b);
}
public static void main(String args[]){
MethodOverLoad m=new MethodOverLoad();
m.sum(24.5f,25.5f);
m.sum(24,26);
m.sum('a','b');
m.sum(50.999,50);
}
}