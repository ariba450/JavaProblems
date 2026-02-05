
package Book;

import java.util.Scanner;

public class MedalProgram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        Double grade=input.nextDouble();
        System.out.println("Is the semester complete? ");
        Boolean ans=input.nextBoolean();
        
        
        if(ans)
        {
            if(grade>=3.5)
            {
                System.out.println("You get a Medal");
            }
            else
                System.out.println("You didnt get a Medal");
                
        }
        else
            System.out.println("Semester not completed");
    }
    
}
