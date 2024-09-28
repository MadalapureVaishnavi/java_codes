class Solution {
    public String reverseWord(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].isEmpty()) {
                sb.append(str[i]);
            }
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

}

public class Main151 {

    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(obj.reverseWord("hey it    me  vaishnavi "));
    }
}