// Find the Power of a Number in Java
import java.util.*;
class powerOfNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ::");
        int num = sc.nextInt();
        int exp = sc.nextInt();
        int result=0;
        
        result = (int)Math.pow(num,exp);
        
        System.out.println(result);
    }
}
