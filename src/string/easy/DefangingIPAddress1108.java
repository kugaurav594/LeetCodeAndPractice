package string.easy;

public class DefangingIPAddress1108 {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String showStr = defangIPAddress(address);
        System.out.println(showStr);
    }

    private static String defangIPAddress(String address) {
        String[] str = address.split("\\."); //this is important simple split(".") will not work
        String newString = "";
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            newString = newString + str[i];
            if (count < str.length - 1) {
                newString = newString + "[.]";
                count++;
            }
        }
        return newString;
    }
}
