class Solution {
    public int romancheck(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
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

    public int convert(String s) {
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if ((i + 1) < n && romancheck(s.charAt(i)) < romancheck(s.charAt(i + 1))) {
                sum -= romancheck(s.charAt(i));
            } else {
                sum += romancheck(s.charAt(i));
            }
        }
        return sum;
    }
}

class Main13 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.convert("IV"));
        System.out.println(s.convert("III"));
    }
}