class il{
int empId=87;//instance variable
void example(){
int empsalary=20000;//local variable
System.out.println("instance variable"+empId);
System.out.println("local variable"+empsalary);
empId=empId+empsalary; //mixed instance and local
System.out.println("after modified variable"+empId);
}
public static void main(String args[]){
il sim=new il();
sim.example(); //inside the call 
}
}