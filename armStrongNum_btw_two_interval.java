// Find the Armstrong Numbers in a given Interval in Java
import java.util.*;
class armStrongNum_btw_two_interval{


   public static void main(String args[]){

        System.out.println("Enter the start and end range::");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int num;

        for(num=start; num < end; num++)
        {
            int temp=num;
            int count=0;
            int sum=0;

            while(num!=0){
                num=num/10;
                count++;
            }
            // System.out.println(count);
            num = temp;
            while(num>0){
                int r = num % 10;
                sum = sum + (int)Math.pow(r,count);
                num = num / 10;
            }
            num = temp;
            if(temp==sum)
            System.out.print(num+" ");
        

        }   

    }
}
