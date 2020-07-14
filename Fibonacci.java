
package fibonacci;

import java.util.Scanner;


public class Fibonacci {

   
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number to print fib numbers");
        int num=scanner.nextInt();
        int  f1=0, f2=1;
       System.out.println("fib numbers are");
        for(int i=1; i<=num; i++)
        {
            System.out.print(f1+ " ");
            int sum=f1 + f2;
            f1 = f2;
            f2 = sum;
          System.out.println();
        }
        
        
     
    }
    
}
