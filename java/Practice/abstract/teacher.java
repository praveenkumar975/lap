interface student{
public final int id = 101;
abstract void studetails();
}
class teacher implements student{
public void studetails(){
System.out.println(id);
System.out.println("it is a override");
}
public static void main(String args[]){
teacher t = new teacher();
t.studetails();
}
}