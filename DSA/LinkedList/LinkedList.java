// Creating linkedlist class and its function in java
public class LinkedList {
        Node head;

        //To insert the value at last of Linked List
        public void insert(int data){
            Node node=new Node();
            node.data=data; //Accessing data to node
            node.next=null; //By default is null, but for readability we mention it.
            //Check is their any prev node in list or not, so according we insert
            if(head==null){
                head=node; //If head is null, then no node is their, so we have to insert value at head
            }
            else{
                Node n=head; //Assigning value of head to new node
                while(n.next!=null){
                    n=n.next; //Jumping between the nodes, until we get next value null
                }
                n.next=node; //n.next =null we get from loop at last index, so now insert value of node, which data of value to be inserted.
                //This is how we insert value at last in linked list as we normally add this at last.
            }
        }

        //To print the values of LinkedList
        public void show(){
            Node node=head;
            while(node.next!=null){
                System.out.println(node.data);
                node=node.next;
            }
            System.out.println(node.data); //As last element as node null, so its doesn't print its data, so we have to do it manually here.
        }

        public void insertAtStart(int data){
            Node node=new Node();
            node.data=data; //Accessing data to node
            node.next=null;
            node.next=head;
            head=node;
        }
        public void insertAt(int index, int data){
            Node node=new Node();
            node.data=data; //Accessing data to node
            node.next=null;
            
            if(index==0)
            {
                insertAtStart(data);
            }
            else{
            //Traversing the node to that location of index
            Node n=head; //Give the node value of head
            //Reach to the location one before the insertion position
            for(int i=0;i<index-1;i++){
                n=n.next;
            }

            node.next=n.next;
            n.next=node;
        }
        }
        public void deleteAt(int index){
            if(index==0)
                head=head.next;
            else{
                //Traversing the node to that locatio of index
            Node n=head;
            Node n1;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
            System.out.println("n1 "+n1.data);
            n1=null; //Nulify the object node that got deleted in this method
        }
    }
}
