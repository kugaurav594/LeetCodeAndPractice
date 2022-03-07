package Array.easy;

public class ReachestCustomerWealth1672 {
    public static void main(String[] args) {
        /*TestCase:
        [[1,2,3],[3,2,1]]*/
    }

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i =0; i<accounts.length; i++){
            int sum = 0;
            for(int j=0; j<accounts[0].length; j++){
                sum = sum+accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}
