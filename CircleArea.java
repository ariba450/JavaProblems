
package practiceproblem01;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double r=input.nextDouble();
        double area=Math.PI*Math.pow(r,2);
        
        System.out.println("Area of circle is "+area); 
    }
    
}

