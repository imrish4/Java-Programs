// Check whether or Not the Number is an Armstrong Number in Java
import java.util.*;
class armStrongNum{
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rem;
        int result=0;
       int temp =num;
       int arm=num;
       int count=0;
       
        while(num!=0){
            num/=10;
            count++;
        }
        // System.out.println(count);

        while(temp>0){
            rem = temp%10;
            result= result + (int)Math.pow(rem,count);
            temp = temp/10;
        }
        
        if(arm==result)
        System.out.println("Armstrong number");
        else
        System.out.println("Not Armstrong number;");

        
    }
}
