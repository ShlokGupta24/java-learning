public class pattern16 {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>i;j--)
            {
                System.out.print(" ");
            }
            System.out.print("*");
        for(int j=1;j<4;j++)
        {
            if(i==1||i==5)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.print("*");
        System.out.println();
        }
    }
}
