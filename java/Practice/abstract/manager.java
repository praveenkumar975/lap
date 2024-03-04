abstract class emp{

public emp(){
System.out.println(" super class Construc.....");
}
void emprole(){
System.out.println("Devloper");
}
abstract void empdetails();
}
class manager extends emp{

public manager(){
System.out.println(" sub class  Construc.....");
}
void empdetails(){
int id = 101;
String name = "Pavan";
System.out.println("Employee ID: " + id + " Employee Name:" + name);
}
public static void main(String args[]){
manager s = new manager();
s.empdetails();
s.emprole();
}
}