import java.util.*;
class Arrays5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int res[]=new int[n];
        Arrays.fill(res,1);
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=1)
            {
                res[j]=a[i];
                j++;
            }
        }
        System.out.println("Array elements after moving Ones to end:");
        for(int e:res)
            System.out.print(e+" ");
    }
}