class PrimeNumbers{
public static void main(String args[]){
for(int i=2;i<=50;i++){
boolean isPrime = true;
for(int j=2;j<=50;j++){
if (i%j==0){
isPrime = false;
break;
}
}
System.out.println(i);

}
}
}