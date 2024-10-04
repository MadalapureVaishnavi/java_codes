class Main58 {
    public int lengthOfLastWord(String s) {
        // Split the string by spaces after trimming leading/trailing spaces
        String[] words = s.trim().split(" ");

        // Return the length of the last word
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Main58 solution = new Main58();

        // Test case 1
        String s1 = "Hello World";
        System.out.println("Length of last word in '" + s1 + "': " + solution.lengthOfLastWord(s1));

        // Test case 2
        String s2 = "   fly me   to   the moon  ";
        System.out.println("Length of last word in '" + s2 + "': " + solution.lengthOfLastWord(s2));

        // Test case 3
        String s3 = "luffy is still joyboy";
        System.out.println("Length of last word in '" + s3 + "': " + solution.lengthOfLastWord(s3));

        // Test case 4 (single word)
        String s4 = "Hello";
        System.out.println("Length of last word in '" + s4 + "': " + solution.lengthOfLastWord(s4));

        // Test case 5 (empty string or spaces only)
        String s5 = "   ";
        System.out.println("Length of last word in '" + s5 + "': " + solution.lengthOfLastWord(s5)); // Will output 0
    }
}
