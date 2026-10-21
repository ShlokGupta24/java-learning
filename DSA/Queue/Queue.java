public class Queue{
    int queue[]=new int[5];
    int front;
    int size;
    int rear;

    public void enQueue(int data){
        if(!isFull()){
        queue[rear]=data;
        rear=(rear+1)%5; //We use modulus to have circular queue, value will be add in circular queue order
        size++;
        }
        else{
            System.out.println("The queue is full, we can't add more value.");
        }
    }

    public int deQueue(){
        int data=queue[front];
        if(!isEmpty()){
        front=(front+1)%5; //We use modulus to have circular queue, value will be remove in circular queue order
        size=size-1;
        }
        else
            System.out.println("The Queue is empty, can't remove more value.");
        return data;
        
    }

    public void show(){
        System.out.print("Elements: ");
        for(int i=0;i<size;i++){
            System.out.print(queue[(front+i)%5]+" ");
        }
        System.out.println();
        //Checking the queue array in circular is working or not
        for(int n:queue){
            System.out.print(n+" ");
        }
        System.out.println();
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return getSize()==0; //In java, we use method to check is full or empty
    }
    public boolean isFull(){
        return getSize()==5;
    }
}
