import java.util.Scanner;
public class LinearSearch {
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n= sc.nextInt();
        System.out.println("Enter the list of numbers(You can't put same element more than once): ");
        int[] ar =new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print(i + 1 + ". ");
            ar[i] = sc.nextInt();
        }
        System.out.println("Enter number to be search: ");
        int a= sc.nextInt();
        int c=-1;
        for(int i=0;i<n;i++)
        {
            if(ar[i]==a)
            {
                c=i+1;
            }
        }
        if(c==-1)
            System.out.println("No element found in list of elements given as "+a);
        else
            System.out.println("Element found at number: "+c);

    }
}
