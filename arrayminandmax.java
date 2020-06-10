class MinMax { 
 
  public static void main(String args[]){
    int arr[] = new int[]{10, 11, 88, 2, 12, 120};
 
    
    int max = getMax(arr);
    System.out.println("Maximum Value is: "+max);
 
    
    int min = getMin(arr);
    System.out.println("Minimum Value is: "+min);
  }
 
 
  public static int getMax(int[] inputArr){ 
    int maxValue = inputArr[0]; 
    for(int i=1;i < inputArr.length;i++){ 
      if(inputArr[i] > maxValue){ 
         maxValue = inputArr[i]; 
      } 
    } 
    return maxValue; 
  }
 
 
  public static int getMin(int[] inputArr){ 
    int minValue = inputArr[0]; 
    for(int i=1;i<inputArr.length;i++){ 
      if(inputArr[i] < minValue){ 
        minValue = inputArr[i]; 
      } 
    } 
    return minValue; 
  } 
}
