//interfaces
interface computer{
    void code();
}
class Laptop1 implements computer{
    public void code(){
        System.out.println("Code, Compile and Run");
    }
}
class Desktop implements computer{
    public void code(){
        System.out.println("Code, Compile and Run faster");
    }
}
class Developer{
    public void DevApp(computer comp){
        comp.code();
    }
}
public class Demo5{
    public static void main(String[] args) {
        computer lap=new Laptop1();
        computer desk=new Desktop();
       Developer dev=new Developer();
       dev.DevApp(lap);
       dev.DevApp(desk);
    }
}