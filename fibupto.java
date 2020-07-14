
package fibonacci;


public class fibupto {
    
    public static void main(String[] args)
    {
        int f1=0, f2=1, n=100;
        System.out.println("print the fib nos upto"+n);
        while(f1<=n)
        {
            System.out.print(f1);
            int sum= f1 + f2;
            f1 = f2;
            f2 =sum;
       System.out.println();
        }
    }
    
}
