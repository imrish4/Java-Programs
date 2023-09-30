// Check Whether or Not the Number is a Strong Number in Java
import java.util.*;
class strongNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num = sc.nextInt();
        
        int sum=0;
        int temp=num;

        while(num!=0)
        {  
            int fact=1;
            int rem = num % 10;
            for(int i=1;i<=rem;i++)
            {
                fact= fact * i;          
                
            } 
   
            sum = sum + fact;
            num = num / 10;
            
        }

        
        if(temp==sum)
        System.out.print("strong number");
        else
        System.out.print("Not strong number");
    }
}
