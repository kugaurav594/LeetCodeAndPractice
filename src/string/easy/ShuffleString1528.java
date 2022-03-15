package string.easy;

import java.util.HashMap;

import static com.ibm.xtq.xslt.typechecker.v1.types.Type.Int;

//** Important
public class ShuffleString1528 {
    public static void main(String[] args) {
        String resultRestor = new ShuffleString1528().restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3});
        System.out.println(resultRestor);
        System.out.println("Other Method");
        String otherResult = new ShuffleString1528().restoreStringOtherWay("codeleet",new int[]{4,5,6,7,0,2,1,3});
        System.out.println(otherResult);
    }

    private String restoreStringOtherWay(String s, int[] indices) {
        char[] ch = new char[indices.length];
        for(int i =0; i < indices.length; i++){
            ch[indices[i]] = s.charAt(i);
        }
        String newString = new String(ch);
        return newString;
    }

    public String restoreString(String s, int[] indices) {
        String newString = "";
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], i);
        }
        for (int i = 0; i < indices.length; i++) {
            newString += s.charAt(map.get(i));
        }
        return newString;
    }
}
