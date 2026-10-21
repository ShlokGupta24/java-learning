//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
class Main {
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in)   ;
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            if (i>a) {
                System.out.println(i);
            }
        }
    }
}