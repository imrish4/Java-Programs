
// Find the Fibonacci Series up to Nth Term in Java
import java.util.*;
class fibonacciSeries{
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=-1;
        int b=1;
        int temp=0;
        for(int i=1;i<=num;i++){
            temp=a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;



        }

    }
}
