


public class search {
    public static void main(String[] args) {
        int nums[]=new int[1000];
        int target=900;

        int result1=LinearSearch(nums, target);

        int result2=binarySearch(nums, target);
        if(result1!=-1)
            System.out.println("Element found at index: "+result1);
        else
            System.out.println("Element is not found.");
    }

    public static int LinearSearch(int[] nums, int target){
        int steps=0;
        for(int i=0;i<nums.length;i++){
            steps++;
            if(nums[i]==target){
                System.out.println("Steps taken by linear:"+steps);
                return i;
            }
        }
         System.out.println("Steps taken by linear:"+steps);

        return -1;
    }

    public static int binarySearch(int[] nums, int target){
        int left=0, right=nums.length-1;
        int steps=0;
        while(left<=right){
            steps++;
            int mid=(left+right)/2;
            if(nums[mid]==target){
                System.out.println("Steps taken by binary:"+steps);
                return mid;
            }
            else if(nums[mid]>target)
                right=mid-1;
            else 
                left=mid+1;
        }
      System.out.println("Steps taken by binary:"+steps);

        return -1;
    }
}
