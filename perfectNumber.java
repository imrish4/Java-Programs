// Check Whether or Not the Number is a Perfect Number in Java
import java.util.*;
class perfectNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num = sc.nextInt();
        int i=1;
        int result = 0;
        for(i=1;i<num;i++)
        {
            if(num%i==0)
            // System.out.println(i+" ");
            result = result + i;
            
        } 
        //   System.out.println(result+" ");
        if(result==num)
        System.out.println("Yes, it's a Perfect Number");
        else
        System.out.println("No, it's a Perfect Number");

        

    }
}
