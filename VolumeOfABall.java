/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practiceproblem01;

import java.util.Scanner;

/**
 *
 * @author alvir
 */
public class VolumeOfABall {

    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
        System.out.print("Radius: ");
    Double r=input.nextDouble();
       
   
    double volume;
    
    volume=4/3*Math.PI*Math.pow(r, 3);
    
        System.out.println("Volume of a ball  "+volume);
    
    
}
}
