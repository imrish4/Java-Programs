// Find the Factors of a Number in Java
import java.util.*;
class factorOfNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num = sc.nextInt();
        
        for(int i=1;i<num;i++)
            if(num%i==0)
        System.out.print(i+", ");
        

    }
}
