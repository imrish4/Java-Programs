import java.util.*;
class primeNumRange{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number::");
        int l = sc.nextInt();
        int u = sc.nextInt();
        int i;
        for(int num=l+1;num<=u-1;num++){
            for(i=2;i<num;i++)
                if(num%i==0)
                    break;
        if(i==num)
        System.out.print(num+" ");
            
        }
    }
}
