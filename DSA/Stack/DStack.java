//Dynamic Stack which expands or shrink dynamically
public class DStack {

    int capacity=2;
    int stack[]=new int[capacity];
    int top=0;
    
    //Adding value to stack in order & Expand the size dynamically
    public void push(int data) {
        if(size()==capacity){
            expand();
        }

        stack[top]=data;
        top++;

    }
    //Expanding the stack by doubling the capacity
    private void expand() {
      int lengh=size();
      int newStack[]=new int[capacity*2];
      //Copying all value of Stack to New Stack
      System.arraycopy(stack, 0, newStack, 0, lengh);
      //Changing reference of newStack to stack
      stack=newStack;
      capacity*=2;
    }

    //Pop is used to delete the last value entered, also shrink the size after popping dynamically
    public int pop(){
        int data=0;

        if(top==0){
            System.out.println("Stack Underflow or Stack has no value to remove");
        }
        else{
        top--;
        data=stack[top];
        stack[top]=0;
        shrink();
        }
        return data;
        
    }
// We will shrink the capacity to half, if their are 1/4 elements left in the dynamic stack only.
    private void shrink() {
      int length=size();
     if(length<=(capacity/2)/2){
        capacity/=2;
        int newStack[]=new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
      //Changing reference of newStack to stack
      stack=newStack;
     }
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
        System.out.println();
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top<=0;
    }
}
