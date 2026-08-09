//Declaring function interface
@FunctionalInterface
interface A{
int add(int i,int j);
}


public class Demo7 {
    public static void main(String[] args) {
        A obj = (i,j) -> i+j; //Using Lambda Expression for function interface to shorten code

        int result=obj.add(5, 4);

        System.out.println(result);
    }
}
