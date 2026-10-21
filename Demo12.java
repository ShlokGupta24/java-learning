//Parallel stream in java concept
import java.util.*;

public class Demo12 {
    public static void main(String[] args) {
        int size=10_000;
        List<Integer> nums= new ArrayList<>(10000);

        Random ran=new Random();

        for(int i=1;i<=size;i++){
            nums.add(ran.nextInt());
        }
        long startseq=System.currentTimeMillis();
        int sum1=nums.stream()
                    .map(n->{
                        try {
                           Thread.sleep(1); 
                        } catch (Exception e) {
                        }
                        return n*2;
                    })
                    .mapToInt(i->i)
                    .sum();
        long endseq=System.currentTimeMillis();

        long startpara=System.currentTimeMillis();

        int sum2=nums.parallelStream()
                    .map(n->{
                        try {
                           Thread.sleep(1); 
                        } catch (Exception e) {
                        }
                        return n*2;
                    })
                    .mapToInt(i->i)
                    .sum();
        long endpara=System.currentTimeMillis();

        System.out.println(sum1+" "+sum2);
        System.out.println("Seq "+(endseq-startseq));
        System.out.println("Para "+(endpara-startpara));
//Parallel stream is faster but our system is fast enough that we can't see any difference and also for simple calculation, normal stream can be faster, as it takes time to generate threads also.
// So we add delay of just 1 ms to actually see the difference
    }
}
