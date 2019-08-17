package prime;
import java.util.Scanner;
import java.io.*;
public class Prime {
    public static void main(String[] args) {
        int i,n,count=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the value of n");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
    
}
