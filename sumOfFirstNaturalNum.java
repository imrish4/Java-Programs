// Find the Sum of First N Natural Numbers in Java
import java.util.*;
class sum_of_first_N_num{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
           
            sum=sum+i;
        }
        System.out.println("Sum of number " + sum);
    }
}

// : Using the Formula
// (num * (num+1))/2
