
package Book;

import java.util.Scanner;

public class area_of_triangle {
    public static void main(String[] args) {
  
    Scanner input=new Scanner(System.in);
    
    int a=input.nextInt();
    int b=input.nextInt();
    int c=input.nextInt();
    
    double s=(a+b+c)/2.0;
    double area =Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area is"+area);   
    }   
}
