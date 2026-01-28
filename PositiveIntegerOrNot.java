
import java.util.Scanner;


public class PositiveIntegerOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=input.nextInt();
        if(number<0){
            System.out.println("The number is negetive");}
        else if(number==0){
            System.out.println("The number is 0");}
        else{
            System.out.println("The number is positive")
                    ;
        }     
        
    }
    
}
