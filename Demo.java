//Encapsulation
class Human
{
    private int age;
    private String name;
    //Constructor of Human Class, it's run whenever obj is created of that class.
    public Human(){
        age=11;
        name="John";
    }
   //Parameterised Constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }
    

    //getting a value
    public int getAge() 
    {
     return age;
    }
   public String getName(){
    return name;
   }
   //Setting a value
    public void setAge(int age) 
    {
     this.age=age;  
     //'this' keyword is use to have access to current obj and we can use the name variable name for the input. It is a imp keyword.
    }
   public void setName(String name){
    this.name=name;
   }
}

public class Demo
{
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1=new Human(11,"Raj");
        // obj.setAge(30);
        // obj.setName("Gaurav");
        System.out.println(obj.getName()+":"+obj.getAge());
        System.out.println(obj1.getName()+":"+obj1.getAge());
    }
}