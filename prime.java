import java.util.Scanner;

public class prime{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in); {
                System.out.println("Ennter a number to check whether it is prime number or not:");
                int a=sc.nextInt();
                int c=0;
                for(int i=1;i<=a;i++)
                {
                    if(a%i==0)
                        c++;
                }
                if(c==2)
                    System.out.println(a+" is a prime number.");
                else
                    System.out.println(a+" is not a prime number.");
            }
        }
    }
