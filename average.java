import java.util.Scanner;
public class average {
    public static float average(int a, int b, int c) {
        float avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c= sc.nextInt();
    System.out.println("Average of 3 numbers: "+average(a,b,c));
    }
}
