

class Demo2 {
    static String name;
    String brand;
 public void show(){
    System.out.println(name+":"+brand);
 }
 public static void show1(Demo2 obj){
    System.out.println(name+":"+obj.brand);
 }
}

class Statickeyword{
    public static void main(String[] args) {
        Demo2 obj1=new Demo2();
        obj1.name="Smartphone";
        obj1.brand="Samsung";

        Demo2 obj2=new Demo2();
        obj2.name="Smartphone";
        obj2.brand="Apple";

        Demo2.name="Phone";
        obj1.show();
        obj2.show();

        Demo2.show1(obj1);
    }
}
