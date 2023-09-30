// Check Whether or Not the Number is an Abundant Number in Java
import java.util.*;
class abundantNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int i;
        int sum = 0;
        for(i=1;i<num/2;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
            }
       
         sum = sum + i;
            
        }
        System.out.println();
       
        if(sum>num)
        System.out.println("Abundant number");
        else
        System.out.println("Not Abundant number");

    }
}
