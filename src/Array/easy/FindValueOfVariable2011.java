package Array.easy;

public class FindValueOfVariable2011 {
  //TestCase:
    //["--X","X++","X++"]
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(int i =0; i <operations.length; i++){
            if(operations[i].equals("--X") || operations[i].equals("X--"))
                value--;
            else
                value++;
        }
        return value;
    }
}
