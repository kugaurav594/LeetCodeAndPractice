import java.util.Arrays;

public class ConcatenationOFArray1929 {
    public static void main(String[] args) {
        ConcatenationOFArray1929 cc = new ConcatenationOFArray1929();
       int[] newArray =  cc.getConcatenation(new int[]{1,2,1});
        Arrays.stream(newArray).forEach(e-> System.out.print(e+" "));
    }
    public int[] getConcatenation(int[] nums) {
        int[] newArray = new int[2*nums.length];
        for(int i =0 ; i < nums.length; i++){
            newArray[i] = nums[i];
            newArray[nums.length+i] = nums[i];
        }
        return newArray;
    }
}
