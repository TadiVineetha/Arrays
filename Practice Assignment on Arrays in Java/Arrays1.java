import java.util.*;
class Arrays1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=0,min=0,sum=0,cnt=0;
        float avg=0;
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        cnt=a.length;
        max=a[0];
        min=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        for(int i=1;i<n;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        for(int i=0;i<n;i++)
            sum+=a[i];
        avg=sum/n;
        System.out.println("The element with the Minimum value:"+min);
        System.out.println("The element with the Maximum value:"+max);
        System.out.println("Average of all array elements:"+avg);
        System.out.println("Total number of array elements:"+cnt);
    }
}