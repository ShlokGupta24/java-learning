enum Laptop{
    //all enums with their price
    Macbook(2200), XPS(2000), Surface, Thinkpad(1800);
    private int price; //variable for price
    //constructor of Laptop for price
    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop:"+name());
        //checking how many times its runs for which enum
    }
    //default constructor
    private Laptop() {
        price=500;
    }
    //getter function to get value of price
    public int getPrice() {
        return price;
    }
    //setter function to set value of price
    public void setPrice(int price) {
        this.price = price;
    }
    
}
public class Demo6{
    public static void main(String[] args) {
        //setting value of price of Macbook
        Laptop.Macbook.setPrice(1900);
        //printing all enums and their prices using enhanced for loop
        for(Laptop lap:Laptop.values()){
            System.out.println(lap+":"+lap.getPrice());
        }

    }
}