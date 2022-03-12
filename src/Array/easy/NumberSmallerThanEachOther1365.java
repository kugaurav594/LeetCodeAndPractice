package Array.easy;

import java.util.Arrays;
import java.util.HashMap;

//Important logic
public class NumberSmallerThanEachOther1365 {
//TestCase
   /* Input: nums = [8,1,2,2,3]
    Output: [4,0,1,1,3]*/
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp); //sort the array
        HashMap<Integer, Integer> map  = new HashMap<>();
        for(int i =0; i < temp.length; i++){
            map.putIfAbsent(temp[i] , i); //map will save if same key is not alread in map
        }
        for(int i =0; i < temp.length; i++){
            temp[i] = map.get(nums[i]); //watch out
        }
        return temp;
    }
}
