abstract class car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Playing Music");
    }
}
abstract class WagonR extends car{
    @Override
    public void drive(){
        System.out.println("Driving...");
    }
}
class UpdatedWagonR extends WagonR{
    @Override
    public void fly(){
        System.out.println("Flying...");
    }
}
public class Demo4 {
    public static void main(String[] args) {
        car obj=new UpdatedWagonR();
        obj.playMusic();
        obj.drive();
        obj.fly();
    }
}
