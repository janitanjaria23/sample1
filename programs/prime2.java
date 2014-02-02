import java.util.*;
class prime2
{
public static void main(String args[]){
float r = 0; //float-includes decimals
int n=1,a,a1,a2=1, x = 0, y =1, q = 0, f = 0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter no:");
a=sc.nextInt();

a1=a;
System.out.print(1);
do{
while (y < n) {
r = n % y;
if (r == 0){
y = y + 1;
f = f + 1;
continue;
}
else {
y = y + 1;
continue;
}
}
if (f == 1){
while(a%n==0){
System.out.print("*"+n);
a=a/n;
a2=a2*n;
}
}
n=n+1;
f=0;
y=1;
}while(a2!=a1);
}} 
