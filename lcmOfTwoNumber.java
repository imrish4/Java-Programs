// LCM of two numbers using Java
import java.util.*;
class lcm{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number::");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm=0;
        int max = num1>num2?num1:num2;
        for(int i=1;i<=num1*num2;i++)
        {
            if(i%num1==0 && i%num2==0){
                lcm = i;
                break;
            }
          
        }
       
        System.out.println("LCM iS = " + lcm);
        
         
    }
}
