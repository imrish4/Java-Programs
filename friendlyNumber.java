// Check Whether or Not the Two Numbers are a Friendly Pair in Java
import java.util.*;
class friendlyNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of num1 and num2 to check friendly number::");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int i , j;
        int sum1=0 ; int sum2 =0;

        for(i=1;i<=num1/2;i++)
        {
            if(num1%i==0)
            {
                // System.out.println(i+" ");
                sum1 = sum1 + i;
            }
        }
        // System.out.println("Sum of factor is " +sum1); 

        

        for(j=1;j<=num2/2;j++)
        {
            if(num2%j==0)
            {
                // System.out.println(j+" ");
                sum2 = sum2 + j;
            }
        }
        // System.out.println("Sum of factor is " +sum2); 

        if(sum1/num1 == sum2/num2)
       System.out.println (num1 + " & " + num2 + " are friendly pairs");
        else
        System.out.println (num1 + " & " + num2 + " are not friendly pairs");

    }
}
