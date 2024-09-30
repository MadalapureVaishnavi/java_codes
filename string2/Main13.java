class Main13 {
    public int checkroman(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50; // 'L' represents 50, not 20
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public int romanToInt(String s) {
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i + 1 < n && checkroman(s.charAt(i + 1)) > checkroman(s.charAt(i))) {
                sum -= checkroman(s.charAt(i));
            } else {
                sum += checkroman(s.charAt(i)); // Access s.charAt(i), not s.charAt(i+1)
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Main13 solution = new Main13();

        // Test cases
        String roman1 = "XIV";
        String roman2 = "MCMXCIV";
        String roman3 = "LVIII";

        System.out.println("Roman numeral: " + roman1 + " -> Integer: " + solution.romanToInt(roman1));
        System.out.println("Roman numeral: " + roman2 + " -> Integer: " + solution.romanToInt(roman2));
        System.out.println("Roman numeral: " + roman3 + " -> Integer: " + solution.romanToInt(roman3));
    }
}
