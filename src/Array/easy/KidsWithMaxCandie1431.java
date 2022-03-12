package Array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithMaxCandie1431 {
   //TestCase
  /*  Input: candies = [4,2,1,1,2], extraCandies = 1
    Output: [true,false,false,false,false]*/
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int[] temp = candies.clone();
        List<Boolean> list = new ArrayList<>();
        Arrays.sort(temp);
        int maxCandi = temp[temp.length - 1];
        for(int i =0; i < candies.length; i++){
            if(candies[i]+extraCandies >= maxCandi)
                list.add(true);
            else
                list.add(false);

        }
        return list;
    }
}
