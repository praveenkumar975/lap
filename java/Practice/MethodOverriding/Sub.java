class Super{
void hello(){
System.out.println("hello");
}
}
class Sub extends Super{

public static void main(String args[]){
Super s = new Super();
s.hello();
}
}
