Class reverse{
public static void main(String args[]){
 int digit=123,rev=0,n;
 
 while(n!=0){
   digit=n%10;
   rev=rev*10 + digit;
   n/=10;
   }
 System.out.println("Reverse of Number:" + rev);
 }
 }
 
 
