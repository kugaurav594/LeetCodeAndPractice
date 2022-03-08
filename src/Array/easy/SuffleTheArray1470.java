package Array.easy;

public class SuffleTheArray1470 {
//TestCase:
    /*Input: nums = [2,5,1,3,4,7], n = 3
    Output: [2,3,5,4,1,7]
    Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].*/
    public int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[nums.length];
        int i =0, j =0;
        while(i < nums.length && j < n){
            newArray[i++] = nums[j];
            newArray[i++] = nums[n+j];
            j++;
        }

        return newArray;
    }
}
