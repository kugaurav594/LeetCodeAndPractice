package Array.easy;

public class MaximumNumberOFWord2114 {
   //TestCase:
/*     1. sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"] :- 6
     2.sentences = ["please wait", "continue to fight", "continue to win"] :- 3*/
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (int i =0; i <sentences.length; i++){
            String subString = sentences[i];
            String[] newArray = subString.split(" ");
            max = Math.max(max, newArray.length);
        }
        return max;
    }
}
