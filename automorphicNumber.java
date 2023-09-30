// Check Whether Or Not the Number is an Automorphic Number in Java
import java.util.*;
class automorphicNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num = sc.nextInt();
        int temp = num;
        int count=0;
        while(temp!=0){
            int rem = temp %10 ;
            count++;
            temp = temp / 10;
        }

        int sq = num * num;
        int sq1 = (int)Math.pow(10,count);
        int last = sq%sq1;



        if(num==last)
        System.out.println("Automorphic number");
        else 
        System.out.println("Not Automorphic number");

    }
}
