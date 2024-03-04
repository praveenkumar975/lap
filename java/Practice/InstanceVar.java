class InstanceVar{
int stuId=101;
InstanceVar(){
System.out.println(stuId);
}
public static void main(){
InstanceVar id=new InstanceVar();
}
}