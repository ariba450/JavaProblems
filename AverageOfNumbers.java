
package Book;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        
        Double[] arr=new Double[n];
        Double sum=0.0;
        
        
        for(int i=0; i<n; i++)
        {
            arr[i]=input.nextDouble();
            sum+=arr[i];
        }
        Double average=sum/n;
        System.out.println(average);
        
    }
    
}
