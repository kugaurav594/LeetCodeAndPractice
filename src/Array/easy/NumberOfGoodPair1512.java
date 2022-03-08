package Array.easy;

public class NumberOfGoodPair1512 {
 //testCase;
    /*Input: nums = [1,2,3,1,1,3]
    Output: 4
    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.*/
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i = 1; i< nums.length; i++){
            int j = i;
            while(j >= 1){
                if(nums[i] == nums[j-1]){
                    count++;
                }
                j--;
            }
        }
        return count;
    }
}
