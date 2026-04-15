
public class primecheck{
    public static void main(String args[])
    {
        int num=19;
        boolean isprime=true;
        for(int i=2; i<= num/2; i++){
            if(num%i==0){
                isprime=false;
                break;
            }
        }
    
      if(isprime)
      System.out.println(num+"is a prime number.");
      else
      System.out.println(num+"it not a prime number.");
    }
}