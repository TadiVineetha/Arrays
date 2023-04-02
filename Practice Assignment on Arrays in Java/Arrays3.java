import java.util.*;
class Arrays3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println(" The elements in ascending order:");
        Arrays.sort(a);
        for(int e:a)
            System.out.print(e+" ");
        System.out.println();
        System.out.println(" The elements in descending order:");
        Collections.reverse(Arrays.asList(a));
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}