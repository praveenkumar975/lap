class mobile{
int id;
String pname;
mobile(int i,String name){
id=i;
pname=name;
}
void lord(){

System.out.print(id +pname);
}
public static void main (String args[]){
mobile m=new mobile(8,"oppo");
m.lord();
}

}