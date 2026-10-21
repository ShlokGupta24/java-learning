
public class Stack {
    public int size=0;
    public int stack[];
    public Stack(int n) {
       size=n;
    stack=new int[size];

    }
    int top=0;
    //Adding value to stack in order
    public void push(int data) {
        if(top==size){
            System.out.println("Stack Overflow or Stack is full");
        }
        else{
        stack[top]=data;
        top++;
        }
    }
    //Pop is used to delete the last value entered.
    public int pop(){
        int data=0;

        if(top==0){
            System.out.println("Stack Underflow or Stack has no value to remove");
        }
        else{
        top--;
        data=stack[top];
        stack[top]=0;
        }
        return data;
        
    }
    //Peek is used to see the last value entered.
     public int peek(){
        int data;
        data=stack[top-1];        
        return data;
    }
    //Print the value in the stack
    public void show(){
        for(int num:stack){
            System.out.print(num+" ");
        }
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top<=0;
    }
}
