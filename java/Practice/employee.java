class employee{
int empid;
String empname;
employee(int id,String name){
empid=id;
empname=name;
}
void madhu(){
System.out.println(empid+"  "+empname);
}
public static void main (String args[]){
employee b=new employee(15,"praveen");
b.madhu();
}


}