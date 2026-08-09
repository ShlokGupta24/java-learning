public class pattern11 {
    public static void main(String[] args)
    {
        int c=1;
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--)
            {
                System.out.print(c+" ");
            }
            System.out.println();
            c++;
        }
    }
}
