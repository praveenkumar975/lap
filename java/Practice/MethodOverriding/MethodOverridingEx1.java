class MethodOverridingEx1{
void mobile(){
System.out.println("Realme");
}
}
class MethodOverLoad extends MethodOverridingEx1{
void mobile(){
System.out.println("SAMSUNG");
}
public static void main(String args[]){
MethodOverLoad m=new MethodOverLoad();
m.mobile();
}
}