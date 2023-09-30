// Check for Perfect Square in Java
import java.util.*;
class perfectSquare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number::");
        int num = sc.nextInt();
       int flag = 0;
       for(int i=1;i<=num/2;i++)
       {
        if(num==i*i)
        {
            flag=1;
            break;
        }
       }
       if(flag==1)
       System.out.println("Perfect sq. number");
       else
        System.out.println("Not Perfect number");
    }
}
