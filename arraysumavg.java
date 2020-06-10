public class SumAvg 
{ 
              public static void main(String args[]) 
        { 
              int sum=0; 
              Scanner sc=new Scanner(System.in); 
              System.out.print("Enter array size : "); 
              int size=sc.nextInt(); 
              int arr[]=new int[size]; 
              System.out.println("Enter the elements of Array"); 
              for(int i=0;i<arr.length;i++) 
                 { 
                    arr[i]=sc.nextInt(); 
                    sum+=arr[i]; 
                  } 
                    float avg=(float)(sum/arr.length); 
            System.out.println("Sum is "+sum+" Average is "+avg); 
        } 
}
