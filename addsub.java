public class AddSub {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("1.Add \n 2.Sub");
int operation = sc.nextInt();
int a;
int b;
int result;
if (operation == 1) {
   System.out.println("Enter first operand: ");
   a = sc.nextInt();
  System.out.println("Enter second operand: ");
  b= sc.nextInt();
  result = a + b;
}
else {
 System.out.println("Enter first operand: ");
  a = sc.nextInt();
System.out.println("Enter second operand: ");
  b = sc.nextInt();
  result = a - b;
}
System.out.println("Result: " + result);
System.out.println("Do you want to continue? Y or N");
sc.nextLine();		
operation = sc.nextLine().charAt(0);
if (operation == 'Y' || operation == 'N') main(args);
sc.close();
}
}
