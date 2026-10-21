public class Runner{
    public static void main(String[] args) {
        // Stack nums=new Stack(5);
        // System.out.println("Empty:"+nums.isEmpty());

        // nums.push(15);
        // nums.push(8);
        // nums.push(10);
        // System.out.println(nums.pop());
        // System.out.println(nums.peek());
        // nums.push(22);
        // nums.push(7);
        // System.out.println(nums.pop());
        // System.out.println("The size of stack is currently: "+nums.size());
        // nums.push(8);
        // nums.push(9);
        // nums.push(22);
        // nums.show();
        // System.out.println();
        // System.out.println("Empty:"+nums.isEmpty());
        // System.out.println(nums.pop());
        //         System.out.println(nums.pop());
        // System.out.println(nums.pop());
        // System.out.println(nums.pop());
        // System.out.println(nums.pop());
        // System.out.println(nums.pop());
        // nums.show();

        DStack nums=new DStack();

        nums.push(15);
        nums.show();
        nums.push(8);
        nums.show();
        nums.push(10);
        nums.show();
        nums.push(2);
        nums.show();
        nums.push(5);
        nums.show();

        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();

    }
}