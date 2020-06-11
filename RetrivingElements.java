class IteratorDemo 
{ 
    public static void main(String args[]) 
    { 
         
        HashSet<String> hs = new HashSet<String>() ; 
  
       
        hs.add("India"); 
        hs.add ("America"); 
        hs.add("Japan"); 
  
        
        Iterator it = hs.iterator(); 
  
       
        while (it.hasNext()) 
            System.out.println(it.next()); 
    } 
} 
