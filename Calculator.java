

package com.practiceproblem1;

import java.util.Scanner;


public class Calculator {

    public static void main(String[] args) {
        
         Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        
        char c=scan.next().charAt(0);
        
        if(c =='+'){
            System.out.println(a+b);
        }
        else if(c =='-'){
            System.out.println(a-b);
        }
                else if(c =='*'){
            System.out.println(a*b);
        }
             else if(c =='/'){
            System.out.println(a/b);
        }
        else
             {
                 System.out.println("Invalid");
             }
        
        
    }
}
