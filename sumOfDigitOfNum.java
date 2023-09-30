// Find the Sum of the Digits of a Number in Java
import java.util.*;
class sumOfDigit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int num = sc.nextInt();
        int sum=0 ;
        int rem;
        while(num>0){

            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
            
            }
        System.out.println(sum);    
    }
}
