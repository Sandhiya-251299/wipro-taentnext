Class Palindrome{
public static void main(String args[]){
int n,num,digit,rev=0;
num=n;

while(n!=0){
 
  digit=n%10;
  rev=rev*10+digit;
  n/=10;
  
  }
  if(n==rev)
    System.out.println("Palindrome Number");
  else
    system.out.println(" Not a Palindrome Number");
 }
}
