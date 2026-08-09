public class pattern12 {
    public static void main(String[] args) {
//spaces
        for (int i = 1; i <= 5; i++) {
                for (int j = 5; j >= i; j--) {
                    System.out.print("  ");
                }
        //1st part of triangle
                for (int k = i; k >=1; k--) {
                    System.out.print(k+" ");
                }
                //2nd part of triangle
                for(int k=2;k<=i;k++)
                    System.out.print(k+" ");
                System.out.println();

            }
        }
    }
