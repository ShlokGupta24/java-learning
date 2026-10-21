public class Demo3 {
    public static void main(String[] args) {
        VeryAdvCalc obj=new VeryAdvCalc();
        int r1=obj.add(7, 3);
        int r2=obj.sub(7, 3);
        int r3=obj.multi(7, 3);
        int r4=obj.div(7, 3);
        double r5=obj.power(7, 3);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}
