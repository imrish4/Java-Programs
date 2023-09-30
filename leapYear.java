// Check Whether or Not the Year is a Leap Year in Java
import java.util.*;
class leapYear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400 == 0)
        System.out.println(year+" Leap Year");
        else
        System.out.println(year+" Not Leap Year");
    }
}
