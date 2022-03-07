package Array.easy;

public class BuildArrayFromPermulation1920 {
    public static void main(String[] args) {
       //TestCase: [0,2,1,5,3,4]
    }
    public int[] buildArray(int[] nums) {
        int[] newArray = new int[nums.length];
        for(int i = 0 ; i <nums.length; i++){
            // int number = ;
            newArray[i] = nums[nums[i]];
        }
        return newArray;
    }
}
