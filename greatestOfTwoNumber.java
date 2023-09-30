// Find the Greatest of the Two Numbers in Java
import java.util.*;
class greatest_two_num{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 == num2)
       System.out.println ("both are equal");
        else if (num1 > num2)
         System.out.println (num1 + " is greater");

        else
         System.out.println (num2 + " is greater");

    }
}
