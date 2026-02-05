
package Book;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int p=input.nextInt();
        
        Boolean isprime= true;
        if(p<=1)
        {
            isprime=false;
        }
        else
        {
            for(int i=2; i<=p/2;i++)
            {
                if(p%i==0)
                {
                    isprime=false;
                    break;
                }
            }
        }
        if(isprime)
            System.out.println("prime number");
        else
            System.out.println("not a prime number");
}
}
