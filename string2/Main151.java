public class Main151 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");

        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].isEmpty()) { // Avoid adding extra spaces if the input has multiple spaces
                sb.append(str[i]);
                if (i != 0) { // Don't add a space after the last word
                    sb.append(" ");
                }
            }
        }

        return sb.toString().trim(); // Trim any trailing spaces
    }

    public static void main(String[] args) {
        Main151 m = new Main151();
        System.out.println(m.reverseWords("the sky is blue"));
    }
}
