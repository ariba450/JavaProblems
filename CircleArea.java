/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practiceproblem01;

import java.util.Scanner;

/**
 *
 * @author alvir
 */
public class CircleArea {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double r=input.nextDouble();
        double area=Math.PI*Math.pow(r,2);
        
        System.out.println("Area of circle is "+area); 
    }
    
}
