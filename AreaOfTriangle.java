/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practiceproblem01;

import java.util.Scanner;

/**
 *
 * @author alvir
 */
public class AreaOfTriangle {

    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
        System.out.print("base: ");
    Double base=input.nextDouble();
        System.out.print("height: ");
    Double height=input.nextDouble();
    
    double area;
    
    area=.5*base*height;
    
        System.out.println("area of a triangle is "+area);
    
    
}
}
