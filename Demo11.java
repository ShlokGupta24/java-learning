//stream class usage
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



public class Demo11 {
    public static void main(String[] args) {
        
        List<Integer> nums=Arrays.asList(4,3,7,5,2,6);
        // Stream<Integer> s1=nums.stream();
        // Stream<Integer> s2=s1.filter(n-> n%2==0);
        // Stream<Integer> s3=s2.map(n->n*2);
        // int result=s3.reduce(0, (c,e)->c+e);

        //other way also to use stream class
        // int result=nums.stream()
        //                 .filter(n->n%2==0)
        //                 .map(n->n*2)
        //                 .reduce(1, (c,e)->c+e);
        // System.out.println(result);

        //We can also get sorted stream also
       Stream<Integer> sortedValues=nums.stream()
                                        .filter(n->n%2==0)
                                        .sorted();
        sortedValues.forEach(n->System.out.println(n));
    }
}
