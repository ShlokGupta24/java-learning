//Use of comparator interface with lambda expression
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo10{
    public static void main(String[] args) {
        
        Comparator<String> com=(String i, String j) -> {
            if(i.length()>j.length())
                return 1;
            else
                return -1;
        };

        List<String> nums=new ArrayList<>();
        nums.add("Shlok");
        nums.add("Shyam");
        nums.add("Amit");
        nums.add("Gajnan");

        Collections.sort(nums,com);
        System.out.println(nums);

    }
}