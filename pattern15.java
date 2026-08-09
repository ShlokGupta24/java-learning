public class pattern15 {
    public static void main(String[] args) {
        int n=8,m=0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
            if (i >= 3) {
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print(" ");
                }
            }
            if(i!=1)
            System.out.print("*");
            for(int j=1;j<=n;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            n=n-2;
            for(int j=2;j<i;j++)
            {
                System.out.print(" ");
            }
            if(i!=1)
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            System.out.print("*");
            for(int j=4;j>i;j--)
            {
                System.out.print(" ");
            }
            if(i!=5)
                System.out.print("*");

            for(int j=1;j<=m;j++)
            {
                System.out.print(" ");
            }
            m=m+2;
            System.out.print("*");
            for(int j=4;j>i;j--) {
                System.out.print(" ");
            }
            if(i!=5)
            System.out.print("*");
            System.out.println();
        }
    }
}