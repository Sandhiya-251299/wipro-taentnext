class Prime {

    public static void main(String[] args) {

        int num;
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else(flag==flag)
            System.out.println(num + " is not a prime number.");
        else
            system.out.println(num + "is neither prime nor a composite")
    }
}
