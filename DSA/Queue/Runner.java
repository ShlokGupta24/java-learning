public class Runner {
    public static void main(String[] args) {
        Queue nums=new Queue();
        System.out.println("Queue is empty:"+nums.isEmpty());
        nums.enQueue(5);
        nums.enQueue(2);
        nums.enQueue(9);
        nums.enQueue(6);
        System.out.println("Queue is full: "+nums.isFull());
        System.out.println("Element deleted:"+nums.deQueue());
        System.out.println("Element deleted:"+nums.deQueue());
        nums.enQueue(7);
        nums.enQueue(6);
        nums.enQueue(5);
        nums.enQueue(8);
        nums.enQueue(9);
        System.out.println("Size: "+nums.getSize());
        nums.show();
        System.out.println("Queue is full: "+nums.isFull());
        System.out.println("Queue is empty:"+nums.isEmpty());
    }
}
