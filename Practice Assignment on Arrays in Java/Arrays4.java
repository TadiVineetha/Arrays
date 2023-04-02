import java.util.*;
class Arrays4
{
    public static boolean prime(int n)
    {
        if(n==1)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--)
        {
            if(prime(a[i]))
            {
                System.out.println("The Largest Prime number in given array:"+a[i]);
                break;
            }
        }
        
    }
}