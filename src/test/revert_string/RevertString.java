package test.revert_string;

public class RevertString {
    public static void main(String[] args) {
        String str = "Hello";
        String total = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            String newStr = Character.toString(str.charAt(i));
            total += newStr;
        }

        System.out.println(total);
    }
}
