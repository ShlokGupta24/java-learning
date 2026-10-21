
public class Runner {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(5);
        list.insert(45);
        list.insert(25);
        list.insert(534);
        list.insert(90);
        list.insertAtStart(22);
        list.insertAt(0, 33);
        list.deleteAt(1);
        list.show();
    }
}
