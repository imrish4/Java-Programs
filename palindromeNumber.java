// Check Whether or Not the Number is a Palindrome in Java
import java.util.*;
class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int num = sc.nextInt();
        int rem;
        int rev=0;
        int num1 = num;
        if(num<0)
            System.out.println("false");
        while(num>0){

            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
            
        }
        if(num1 == rev)
            System.out.println("true");
        else
            System.out.println("false");

          
    }
}
